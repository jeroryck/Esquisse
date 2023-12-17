package stairCase;


//__________________________________________________________________________________________________
//
//  A general framework for suite of dates.
//  Could be used as "stepRanges" for a Time series or a base of sampling

import java.util.*;

public abstract class TimeSuite {

    public Integer[] dates;

    public abstract void populate();

    // to introduce noise in the time series. Noise is limited to a % of the interval  between two dates
    public TimeSuite noise(double percentage){

        Integer[] dates = new Integer[this.dates.length];

        if ((percentage<0)||(percentage>1)) {
            throw new RuntimeException(" incorrect noise % :"+percentage);
        }

        for (int i = 1; i < dates.length-1; i++) {

            // noise decreases (choice = 0) or increases (choice = 1) the date
            Random random = new Random();
            int choice = random.nextInt(2);

            if (choice == 0) {
                dates[i] = (int) Math.round(this.dates[i] -(this.dates[i]-this.dates[i-1])*percentage);
            } else {
                dates[i] = (int) Math.round(this.dates[i] +(this.dates[i+1]-this.dates[i])*percentage);
            }
        }

        return buildFromArray(dates);
    }

    public TimeSuite superpose(TimeSuite toSuperpose){

        List<Integer> pointsStep = new ArrayList<>();

        // first construct the new steps, merging the two suites
        for (int i = 0; i < this.dates.length; i++) {
                pointsStep.add(this.dates[i]);
        }
        for (int i = 0; i < toSuperpose.dates.length; i++) {
            pointsStep.add(toSuperpose.dates[i]);
        }

        // Remove duplicates using a HashSet
        HashSet<Integer> uniqueValues = new HashSet<>(pointsStep);
        pointsStep.clear();
        pointsStep.addAll(uniqueValues);

        // Sort the merged list in ascending order
        Collections.sort(pointsStep);

        Integer[] dates = new Integer[pointsStep.size()];
        for (int i = 0; i < pointsStep.size(); i++) {
            dates[i] = pointsStep.get(i);
        }
        return buildFromArray(dates);
    }

    //------------------------------------------------------------------------------------------------------------
    //
    //  Constructor and builder

    public abstract TimeSuite buildFromArray(Integer[] dates);

    public TimeSuite(){}
}
