package Components.Mixing;

import Concepts.Chord;
import Concepts.Duration;
import format.MasterOfFiles;
import stairCase.Harmony;
import stairCase.TimeSerie;

import java.util.ArrayList;
import java.util.List;

import static Concepts.Duration.PIANO_STYLE;

public class Blurring<T> {

    // blurring the transition between two ranges consists
    // of adding small ranges which announce or remind you  the change in value between the two original ranges
    //  ---------------******************* -> -----------**---***--************

    // Parametrization of the blurring range size : % of the blurred initial range to compute the size of the little burring
    // range and its place
    public Double blurRange;

    // Position of the blurring range position : blurPos*(length of initial range) before or after the frontier between
    // the two initial range
    public Double blurPos;

    //------------------------------------------------------------------------------------------------------------
    //
    //  Core method

    public TimeSerie<T> blur(TimeSerie<T> series) {

        List<T> listValues = new ArrayList<>();
        List<Integer> listRanges = new ArrayList<>();

        // Nothing is changed for the beginning of the series
        listValues.add(series.heights[0]);
        listRanges.add(series.stepRanges[0]);

        // Core of the series
        for (int i = 1; i <= series.heights.length-1  ; i++) {

            int position = series.stepRanges[i];

            // added range before : compute the position
            int blurRangeLength = (int) Math.floor(blurRange* series.getStepLength(i-1));
            if (blurRangeLength ==0)
                throw new RuntimeException("Error in blur range before : step is 0");
            int endNewRange = series.stepRanges[i] -(int) Math.ceil(series.getStepLength(i-1)*(blurPos));
            int beginningNewRange = endNewRange -blurRangeLength;
            if (beginningNewRange<series.stepRanges[i-1])
                throw new RuntimeException("Error in blur range before : too long step");

            // and now add the new step
            listRanges.add(beginningNewRange);
            listValues.add(series.heights[i]);
            listRanges.add(endNewRange);
            listValues.add(series.heights[i-1]);

            // preserve the original step
            listRanges.add(series.stepRanges[i]);
            listValues.add(series.heights[i]);

            // added range after : compute the position
            blurRangeLength = (int) Math.floor(blurRange* series.getStepLength(i));
            if (blurRangeLength ==0)
                throw new RuntimeException("Error in blur range after : step is 0");
            beginningNewRange = series.stepRanges[i] + (int) Math.ceil(series.getStepLength(i)*(blurPos));
            endNewRange = beginningNewRange + blurRangeLength;
            if (endNewRange>=series.stepRanges[i+1])
                throw new RuntimeException("Error in blur range after : too long step");

            // add the new step
            listRanges.add(beginningNewRange);
            listValues.add(series.heights[i-1]);
            listRanges.add(endNewRange);
            listValues.add(series.heights[i]);
        }

        // to conclude ...
        listRanges.add(series.stepRanges[series.stepRanges.length-1]);

        return series.buildFromList(listRanges,listValues);
    }


    //-------------------------------------------------------------------------------------------------------------

    public Blurring(){};
    public Blurring(Double blurRange, Double blurPos) {
        this.blurPos = blurPos;
        this.blurRange = blurRange;
    }

    //----------------------------------------------------------------------------------------------------------------
    //
    //  Test

    public static void main(String[] args) {

        Chord baseA = new Chord(new String[]{"c","ees", "g","bes"});
        Chord baseB = new Chord(new String[]{"c","ees","bes","cis'"});

        Harmony seriesOfBaseChordRaw = new Harmony();
        seriesOfBaseChordRaw.heights = new Chord[]{baseA, baseB};
        seriesOfBaseChordRaw.stepRanges = new Integer[3];

        for (int i = 0; i < 3; i++) {
            seriesOfBaseChordRaw.stepRanges[i]=i*4* Duration.second();
        }
        Blurring<Chord> chordBlurring = new Blurring<>(0.1,0.2);
        Harmony seriesOfBaseChord = (Harmony) chordBlurring.blur(seriesOfBaseChordRaw);

        MasterOfFiles masterSave = new MasterOfFiles();
        masterSave.subDirectoryName = "FiveGuys";

        String[] leftHandLy = seriesOfBaseChordRaw.lilyPondVersion(PIANO_STYLE);
        masterSave.save(leftHandLy, "leftHand");

        String[] rightHandLy = seriesOfBaseChord.lilyPondVersion(PIANO_STYLE);
        masterSave.save(rightHandLy, "rightHand");

    }

}
