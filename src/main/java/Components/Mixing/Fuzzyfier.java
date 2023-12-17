package Components.Mixing;

import Concepts.Chord;
import stairCase.Harmony;
import stairCase.TimeSerie;

import java.util.Random;

public class Fuzzyfier {


    // the % of the total possible move allowed for the fuzzyfication
    Double extend;
    public void setExtend(Double extend) {this.extend = extend;}
    public Double getExtend() {
        return extend;}

    // the fuzzy move is quantified by "unit"
    int unit;
    public int getUnit() {
        return unit;}
    public void setUnit(int unit) {
        this.unit = unit;}

//----------------------------------------------------------------------------------------------
    //

    public void fuzzyfy(TimeSerie timeSerie){



        Random random = new Random();
        for (int i = 1; i < timeSerie.stepRanges.length-1; i++) {
            int maxMoveOnLeft = (int) Math.ceil(timeSerie.getStepLength(i-1)*getExtend());
            int maxMoveOnRight = (int) Math.floor(timeSerie.getStepLength(i)*getExtend());

            // We are looking for something like n*unit, with -MaxMoveOnLeft <= n*unit < maxMoveOnRight
            int minNValue = (int) Math.ceil(-maxMoveOnLeft/unit);
            int maxNValue = (int) Math.floor(maxMoveOnRight/unit);
            int randomN = random.nextInt(maxNValue - minNValue + 1) + minNValue;

            // we apply the move on the result harmony.
            timeSerie.stepRanges[i]=timeSerie.stepRanges[i]+randomN*unit;
        }
    }

    public Fuzzyfier(Double extend, int unit){
        this.extend = extend;
        this.unit = unit;
    }





}
