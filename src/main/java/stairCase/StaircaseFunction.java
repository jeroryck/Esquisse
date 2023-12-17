package stairCase;

import Concepts.Chord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static Concepts.Pitch.REST;

public class StaircaseFunction extends TimeSerie<Integer> {

    @Override
    public Integer silentValue() {
        return REST;
    }

    //-------------------------------------------------------------------------------------------------
    //   Constructors and builder
    //


    public StaircaseFunction buildFromList(List<Integer> stepsPosition, List<Integer> values){

        StaircaseFunction result = new StaircaseFunction();
        result.stepRanges = new Integer[stepsPosition.size()];
        for (int i = 0; i < stepsPosition.size(); i++) {
            result.stepRanges[i] = stepsPosition.get(i);
        }

        result.heights = new Integer[values.size()];
        for (int i = 0; i < values.size(); i++) {
            result.heights[i]= values.get(i);
        }

        return result;
    }

    public StaircaseFunction(Integer[] heights, Integer[] stepRanges) {
        this.stepRanges = stepRanges;
        this.heights = heights;
    }

    public StaircaseFunction() {
    }

    //-----------------------------------------------------------------------------------------------
    //
    //  multiple operator

    public void multiply(StaircaseFunction otherFunction) {

        // first construct the new steps, merging the two functions
        List<Integer> mergedList = new ArrayList<>();
        for (int i = 0; i < this.stepRanges.length; i++) {
            if ((this.stepRanges[i] >= otherFunction.stepRanges[0]) &&
               (this.stepRanges[i] <= otherFunction.stepRanges[otherFunction.stepRanges.length-1]))
                mergedList.add(this.stepRanges[i]);
        }

        for (int i = 0; i < otherFunction.stepRanges.length; i++) {
            if ((otherFunction.stepRanges[i] >= this.stepRanges[0]) &&
                    (otherFunction.stepRanges[i] <= this.stepRanges[this.stepRanges.length-1]))
                mergedList.add(otherFunction.stepRanges[i]);
        }

        // Sort the merged list in ascending order
        Collections.sort(mergedList);

        // Remove duplicates using a HashSet
        HashSet<Integer> uniqueValues = new HashSet<>(mergedList);
        mergedList.clear();
        mergedList.addAll(uniqueValues);



        // Set the new values resulting from the multiplication
       Integer[] newValues = new Integer[mergedList.size()-1];
        for (int i = 0; i < mergedList.size()-1 ; i++) {
            newValues[i]= this.getValue(mergedList.get(i))*otherFunction.getValue(mergedList.get(i));
        }

        this.stepRanges = new Integer[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            this.stepRanges[i] = mergedList.get(i);
        }
        this.heights = newValues;
    }




    //-----------------------------------------------------------------------------------------------------
    //
    //   Useful methods

    public void prettyPrint(){
        for (int i = 0; i < this.getNumberOfSteps(); i++) {
            System.out.println("Position "+this.stepRanges[i]+" value "+this.heights[i]);
        }
    }

    //---------------------------------------------------------------------------------------------------
    //
    // To play with while testing ...

    final static public StaircaseFunction TEST_INSTANCE;

    static {
        Integer[] heights = {2, 3, 1, 2, 4};
        Integer[] stepRanges = {1, 5, 13, 21, 30,40 };
        TEST_INSTANCE = new StaircaseFunction(heights,stepRanges);
    }

    public static void main(String[] args) {
        // Example usage:
        Integer[] heights1 = {1};
        Integer[] stepRanges1 = {0, 9};

        Integer[] heights2 = {2, 3, 1, 2, 4};
        Integer[] stepRanges2 = {1, 3, 5, 7, 9, 11};

        StaircaseFunction staircase1 = new StaircaseFunction(heights1, stepRanges1);
        StaircaseFunction staircase2 = new StaircaseFunction(heights2, stepRanges2);

        System.out.println("StairCase 1 : ");
        staircase1.prettyPrint();

        System.out.println("StairCase 2 :");
        staircase2.prettyPrint();

        // Multiply staircase1 by staircase2
        staircase1.multiply(staircase2);

        // Print the resulting values
        System.out.println("Resulting values after multiplication: " );
        staircase1 .prettyPrint();
    }
}

