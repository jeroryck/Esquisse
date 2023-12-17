package Components;

import Concepts.Range;
import stairCase.TimeSuite;

public class Rythm extends TimeSuite {


    int tactus;


    // Generation of a series of multiple of tactus, starting at lower bound of range and finishing at upper bound
    public void populate(){

        // Nb : we add 1, it's a problem of good number of  pickets for a fence ...
        int numberOfPoint = 1+(range.getUpperBound()- range.getLowerBound())/tactus;
        dates = new Integer[numberOfPoint];
        dates[0] = range.getLowerBound();
         for (int i = 1; i < numberOfPoint; i++) {
            dates[i] = dates[i-1]+tactus;
        }
    }

    Range range;

    //-----------------------------------------------------------------------------------------------------------
    //
    //  Builders and constructors

    @Override
    public TimeSuite buildFromArray(Integer[] dates) {
        Rythm result = new Rythm();

        result.dates = dates;
        return result ;
    }

    public Rythm(int tactus, Range range){
           this.tactus = tactus;
           this.range = range;
    }

    public Rythm(){}
}
