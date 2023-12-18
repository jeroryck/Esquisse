package stairCase;

import java.util.*;

public abstract class TimeSerie<T> {

    public T[] heights;
    public Integer[] stepRanges;

    // x is some value in the range of the function
    public T getValue(int x) {
        for (int i = 0; i < stepRanges.length; i++) {
            if (x >= stepRanges[i] && (i == stepRanges.length - 1 || x < stepRanges[i + 1])) {
                return heights[i];
            }
        }

        throw new IllegalArgumentException("Invalid input x: " + x);
    }

    // x is an index of a step
    public int getStepLength(int x){
        if (x < stepRanges.length) {
            return stepRanges[x+1]-stepRanges[x];
        }
        throw new IllegalArgumentException("Invalid step for length calculation: " + x);
    }

    public T[] getHeights() {return heights;}
    public void setHeight(int stepIndex, T height) {
        if (stepIndex < 0 || stepIndex >= heights.length) {
            throw new IllegalArgumentException("Invalid step index: " + stepIndex);
        }

        heights[stepIndex] = height;
    }

    public int getNumberOfSteps() {
        // One value for one step ...
        return heights.length;
    }

    public int getMaxTime() {return stepRanges[stepRanges.length-1];}
    public int getMinTime() {return  stepRanges[0];}

    public Boolean containsDate(int date){
        return ((getMinTime()<= date) && (date<= getMinTime()));
    }


    public Integer[] getStepRanges() {
        return stepRanges;
    }

    public abstract T silentValue();

    //--------------------------------------------------------------------------------------------
    //
    // Unary operators

    // Cut and extract a subseries in the date interval [min, max[
    // return null if [min, max[ is outside the domain of the series
    public TimeSerie cut(int min, int max) {

        if (min>=max)
            throw new RuntimeException("error in cut min >= max");

        // Search the first step greater than min
        int minPos=0;
        if (min < stepRanges[0]) minPos = 0;
        else if (min >= stepRanges[stepRanges.length - 1])
            return null;
        else {
            Boolean found = false;
            int i = 0;
            while ((!found) && (i < this.stepRanges.length)) {
                if ((stepRanges[i] <= min) && (min < stepRanges[i + 1])) {
                    found = true;
                    minPos = i;
                }
                else i++;
            }
        }

        // Search the last step lower than max
        int maxPos;
        if (max >= stepRanges[stepRanges.length-1]) maxPos = stepRanges.length-1;
        else if (max < stepRanges[0])
            return null;
        else {
            Boolean found = false;
            int i = 0;
            while ((!found) && (i < this.stepRanges.length)) {
                if ((stepRanges[i] <= max) && (max < stepRanges[i + 1])) {
                    found = true;
                    maxPos = i;
                }
                else i++;
            }
            maxPos = i;
        }

        System.out.println("min Pos "+minPos);
        System.out.println("max ¨Pos "+maxPos);

        // We cut, as we know the places to do it
        List<T> heightsList = new ArrayList<>();
        List<Integer> stepList = new ArrayList<>();
        // We add a new pos if the cut is between two positions
        if (min >= stepRanges[minPos]) {
            heightsList.add(this.getValue(min));
            stepList.add(min);
        }
        // core work
        for (int i = minPos+1; i < maxPos ; i++) {
            heightsList.add(heights[i]);
            stepList.add(stepRanges[i]);
        }
        // Add (or not) an extra step at the end
        if (max == stepRanges[maxPos]) stepList.add(stepRanges[maxPos]);
        else {
            heightsList.add(heights[maxPos]);
            stepList.add(stepRanges[maxPos]);
            stepList.add(max);
        }

        return this.buildFromList(stepList,heightsList);
    }


    // Length of the steps are modified randomly by a multiple of unit
    // The first and the last position remain the same
    public void fuzzyfy( int unit){

        Random random = new Random();
        for (int i = 1; i < stepRanges.length-1; i++) {
            int maxMoveOnLeft = getStepLength(i-1)*3/4;
            int maxMoveOnRight = getStepLength(i)*3/4;

            // We are looking for something like n*unit, with -MaxMoveOnLeft <= n*unit < maxMoveOnRight
            int minNValue = (int) Math.ceil(-maxMoveOnLeft/unit);
            int maxNValue = (int) Math.floor(maxMoveOnRight/unit);
            int randomN = random.nextInt(maxNValue - minNValue + 1) + minNValue;

            stepRanges[i]=stepRanges[i]+randomN*unit;
        }

    }

    // the sampling is done if the point of sampling is in the stepRange of the serie
    // else nothing is done and the point is discarded
    // last point of sampling has no associated value, but is use to complete the last step
    public TimeSerie<T> sample(Integer[] whishedPoints){

        List<T> samples = new ArrayList<>();
        List<Integer> effectivePoints = new ArrayList<>();

        int currentIndex = 0;
        // Skipping the sampling points to small
        while (whishedPoints[currentIndex]< this.getMinTime()){
            currentIndex++;
        }
        // Some stuff to do now
        while ((currentIndex < whishedPoints.length-1) && (whishedPoints[currentIndex]<=this.getMaxTime()) ){
            samples.add(this.getValue(whishedPoints[currentIndex]));
            effectivePoints.add(whishedPoints[currentIndex]);
            currentIndex++;
        }

        // we add the last point
        if (whishedPoints[currentIndex]>=this.getMaxTime())
            effectivePoints.add(this.getMaxTime());
            else
                effectivePoints.add(whishedPoints[currentIndex]);

        return buildFromList(effectivePoints,samples);
    }

    // Editing : when "mask" is false, the time series is erased

    public TimeSerie edit(Mask mask){

        List<T> values = new ArrayList<>();
        List<Integer> pointsStep = new ArrayList<>();

        // first construct the new steps, merging the two functions
        for (int i = 0; i < this.stepRanges.length; i++) {
            if ((this.stepRanges[i] >= mask.stepRanges[0]) &&
                    (this.stepRanges[i] <= mask.stepRanges[mask.stepRanges.length-1]))
                pointsStep.add(this.stepRanges[i]);
        }

        for (int i = 0; i < mask.stepRanges.length; i++) {
            if ((mask.stepRanges[i] >= this.stepRanges[0]) &&
                    (mask.stepRanges[i] <= this.stepRanges[this.stepRanges.length-1]))
                pointsStep.add(mask.stepRanges[i]);
        }

        // Remove duplicates using a HashSet
        HashSet<Integer> uniqueValues = new HashSet<>(pointsStep);
        pointsStep.clear();
        pointsStep.addAll(uniqueValues);

        // Sort the merged list in ascending order
        Collections.sort(pointsStep);

        // Apply the mask to the points
        for (int i = 0; i < pointsStep.size()-1 ; i++) {
            if (mask.getValue(pointsStep.get(i)))
                values.add(i,this.getValue(pointsStep.get(i)));
            else values.add(i,silentValue());
        }

        return buildFromList(pointsStep,values);
    }

    public TimeSerie translate(int shifting){

        List<T> listHeights = new ArrayList<>();
        List<Integer> listRanges = new ArrayList<>();

        for (int i = 0; i < stepRanges.length; i++) {
            listRanges.add(this.stepRanges[i]+shifting);
        }
        for (int i = 0; i < heights.length; i++) {
            listHeights.add( heights[i]);
        }

        return buildFromList(listRanges,listHeights);
    }

    //-----------------------------------------------------------------------------------------------
    //
    //  Builders

    public void populate(List<Integer> stepsPosition, List<Integer> values, TimeSerie copy){
        copy.stepRanges = new Integer[stepsPosition.size()];
        for (int i = 0; i < stepsPosition.size(); i++) {
            copy.stepRanges[i] = stepsPosition.get(i);
        }

        copy.heights = new Integer[values.size()];
        for (int i = 0; i < values.size(); i++) {
            copy.heights[i]= values.get(i);
        }
    }

    public abstract TimeSerie buildFromList(List<Integer> stepRanges,List<T> height );



}
