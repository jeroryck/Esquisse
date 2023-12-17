package Components.GraceGenerators;

import Concepts.PitchConstraint;
import Concepts.Sound;
import stairCase.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Beautifier<SeedType,GraceType extends Sound> {


    public abstract TimeSerie<GraceType> generateGrace(SeedType seed);

    // Beautifier adds graces to a harmony or a pitch (following "SeedType"), each beat of a given TimeSuite
    // the generated grace are made of sound or pitch or int or index (of Pitch) (following "GraceType").

    //  Used to reframe the graces. The default value can be re-assigned.
    PitchConstraint ambitus = PitchConstraint.PIANO_RANGE;
    public void beautify(TimeSerie<SeedType> series, TimeSuite beats,TimeSerie<GraceType> graces){
        List<GraceType> heightList = new ArrayList<>();
        List<Integer> stepList = new ArrayList();
        Random random = new Random();

        int currentIndex = 0;
        int endOfLastGrace = -1;

        while ((currentIndex < beats.dates.length-1) && (beats.dates[currentIndex]<=series.getMaxTime()) ){

            int currentDateGrace = beats.dates[currentIndex];
            // the beat is skip if its date is smaller than the last date of the previous grace
            if (currentDateGrace> endOfLastGrace) {

                // a grace is possible as we are after the end of the previous one
                SeedType baseGrace = series.getValue(currentDateGrace);
                TimeSerie<GraceType> grace = generateGrace(baseGrace);
                TimeSerie<GraceType> shiftGrace = grace.translate(currentDateGrace);

                // the grace is adjusted in the ambitus
                ambitus.reframe((TimeSerie<Sound>)  shiftGrace);

                // the grace is appended to the result
                // be aware we need to remove the last element of the step range list as the
                // first element of the added phrase will take its place
                if (stepList.size()>=1) stepList.remove(stepList.size()-1);
                for (int i = 0; i < grace.heights.length; i++) {
                    heightList.add(shiftGrace.heights[i]);
                }
                for (int i = 0; i < grace.stepRanges.length; i++) {
                    stepList.add(shiftGrace.stepRanges[i]);
                }
                endOfLastGrace = shiftGrace.stepRanges[shiftGrace.stepRanges.length-1];
            }

            currentIndex++;
        }

        // Final trick to implement side effect on the parameter "graces"
        TimeSerie<GraceType> localGrace= graces.buildFromList(stepList,heightList);
        graces.stepRanges =localGrace.stepRanges;
        graces.heights = localGrace.heights;
    }

    public Beautifier(){}
}
