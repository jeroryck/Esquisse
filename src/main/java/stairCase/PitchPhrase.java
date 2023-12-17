package stairCase;

import Concepts.Pitch;
import Concepts.Sound;
import format.LilyPondFormatter;

import java.util.ArrayList;
import java.util.List;

import static Concepts.Pitch.REST;

public class PitchPhrase extends TimeSerie<Pitch>{
    @Override
    public Pitch silentValue() {
        return new Pitch(REST);
    }

    public String[] lilyPondVersion(int style) {
        return (new LilyPondFormatter()).format(this,style);
    }

    //----------------------------------------------------------------------------------------------------

    public PitchPhrase transpose(Integer decal){
        PitchPhrase result = new PitchPhrase();
        Pitch[] resultHeight = new Pitch[this.heights.length];
        Integer[] resultStepRange = new Integer[this.stepRanges.length];

        for (int i = 0; i < stepRanges.length; i++) {
            resultStepRange[i] = this.stepRanges[i];
        }
        for (int i = 0; i < heights.length; i++) {
            resultHeight[i] = heights[i].transpose(decal);
        }

        result.stepRanges = resultStepRange;
        result.heights = resultHeight;
        return result;
    }


    public SoundPhrase octaviate(){
        SoundPhrase result = new SoundPhrase();
        Sound[] resultHeight = new Sound[this.heights.length];
        Integer[] resultStepRange = new Integer[this.stepRanges.length];

        for (int i = 0; i < stepRanges.length; i++) {
            resultStepRange[i] = this.stepRanges[i];
        }
        for (int i = 0; i < heights.length; i++) {
            resultHeight[i] = heights[i].octaviate();
        }

        result.stepRanges = resultStepRange;
        result.heights = resultHeight;
        return result;

    }


    //-----------------------------------------------------------------------------------------------------
    //
    //  Constructor and builder

    @Override
    public PitchPhrase buildFromList(List<Integer> stepsPosition, List<Pitch> values) {
        PitchPhrase result = new PitchPhrase();
        result.stepRanges = new Integer[stepsPosition.size()];
        for (int i = 0; i < stepsPosition.size(); i++) {
            result.stepRanges[i] = stepsPosition.get(i);
        }

        result.heights = new Pitch[values.size()];
        for (int i = 0; i < values.size(); i++) {
            result.heights[i]= values.get(i);
        }

        return result;
    }

    public PitchPhrase(){};

    public PitchPhrase(Phrase ph){
        this.heights = new Pitch[ph.heights.length];
        for (int i = 0; i < ph.heights.length; i++) {
            this.heights[i] = new Pitch(ph.heights[i]);
        }

        this.stepRanges = new Integer[ph.stepRanges.length];
        for (int i = 0; i < ph.stepRanges.length; i++) {
            this.stepRanges[i] = ph.stepRanges[i];
        }
    }

    public static PitchPhrase fastInput(String[] infos){
        List<Pitch> pitchList = new ArrayList<>();
        List<Integer> durationList = new ArrayList<>();
        int pitchAsInt ;
        int durAsInt ;
        int currentDate = 0;
        durationList.add(currentDate);

        for (int i = 0; i < infos.length; i++) {
            if ((i%2)==0){
                // i is even : pitch specification to proceed
                pitchList.add(new Pitch(Pitch.asInt(infos[i])));
            }
            if ((i%2)==1){
                // i is odd : duration value to proceed
                currentDate = currentDate+Integer.valueOf(infos[i]);
                durationList.add(currentDate);
            }
        }

        PitchPhrase result = new PitchPhrase();
        return result.buildFromList(durationList,pitchList);
    }

}
