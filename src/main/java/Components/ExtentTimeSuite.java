package Components;

import Concepts.Range;
import stairCase.TimeSuite;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExtentTimeSuite extends TimeSuite {

    // Each generated extent of time must be in range
    Range range;

    // the bound of the sum of all dates
    int totalDuration;

    int firstValue;

    // Each generated extent is calculated as the precedent + an "innovation"
    int[] innovations;


    // random walk. If the walk touch the bounds, reinitialisation.
    public void populate(){

        List<Integer> population = new ArrayList<>();
        population.add(0);
        Random random = new Random();

        // first extend
        population.add(firstValue);
        int total = firstValue;
        int currentIndex = 1;

        while (total<= totalDuration){
            currentIndex++;
            int randomIndex = random.nextInt(innovations.length-1);
            int candidat = population.get(currentIndex-1)+ innovations[randomIndex];
            if (range.contains(candidat))
                {total = total +candidat;
                population.add(currentIndex,total);}
            else
                {population.add(currentIndex,total+firstValue);
                    total = total+firstValue;}
        }
        dates = new Integer[population.size()];
        for (int i = 0; i < dates.length ; i++) {
            dates[i]= population.get(i);
        }
    }



    //----------------------------------------------------------------------------------------------------------
    //
    // Builders and constructors

    @Override
    public TimeSuite buildFromArray(Integer[] dates) {

        ExtentTimeSuite result = new ExtentTimeSuite();
        result.dates = dates;

        return result;
    }

    public ExtentTimeSuite(int[] evolutions, int totalDuration, int firstValue, Range range){
        innovations =evolutions;
        this.totalDuration = totalDuration;
        this.range = range;
        this.firstValue = firstValue;
    }

    public ExtentTimeSuite(){}

}
