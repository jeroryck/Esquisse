package stairCase;

import Concepts.Duration;
import Concepts.Pitch;
import format.LilyPondFormatter;

import java.util.ArrayList;
import java.util.List;

public  class Phrase extends StaircaseFunction {



    public String name;

    public void copy(Phrase ph1){

        ph1.name = this.name;
        ph1.heights = new Integer[this.heights.length];
        System.arraycopy(this.heights,0,ph1.heights,0,this.heights.length);
        ph1.stepRanges = new Integer[this.stepRanges.length];
        System.arraycopy(this.stepRanges,0,ph1.stepRanges,0,this.stepRanges.length);

    }

    public String[] lilyPondVersion(int style) {
        return (new LilyPondFormatter()).format(this,style);
    }

    // Useful function to specify explicitly short motifs : pitch, duration pitch duration etc ...
    public static Phrase fastInput(String[] infos){
        List<Integer> pitchList = new ArrayList<>();
        List<Integer> durationList = new ArrayList<>();
        int pitchAsInt ;
        int durAsInt ;
        int currentDate = 0;
        durationList.add(currentDate);

        for (int i = 0; i < infos.length; i++) {
            if ((i%2)==0){
                // i is even : pitch specification to proceed
                pitchList.add(Pitch.asInt(infos[i]));
            }
            if ((i%2)==1){
                // i is odd : duration value to proceed
                currentDate = currentDate+Integer.valueOf(infos[i]);
                durationList.add(currentDate);
            }
        }

        Phrase result = new Phrase();
        return result.buildFromList(durationList,pitchList);
    }

    //----------------------------------------------------------------------------------------------------------------

    public Phrase transpose(int intervalle){
        Phrase result = new Phrase();
        Integer[] resultHeight = new Integer[this.heights.length];
        Integer[] resultStepRange = new Integer[this.stepRanges.length];

        for (int i = 0; i < stepRanges.length; i++) {
            resultStepRange[i] = this.stepRanges[i];
        }
        for (int i = 0; i < heights.length; i++) {
            resultHeight[i] = heights[i]+intervalle;
        }

        result.stepRanges = resultStepRange;
        result.heights = resultHeight;
        return result;
    }



    //----------------------------------------------------------------------------------------------------------
    //
    // builder

    public Phrase buildFromList(List<Integer> stepsPosition, List<Integer> values){

        Phrase result = new Phrase();
        result.populate(stepsPosition,values,result);

        return result;
    }

}
