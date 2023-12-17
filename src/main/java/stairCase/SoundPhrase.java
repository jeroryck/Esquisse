package stairCase;

import Concepts.Chord;
import Concepts.Pitch;
import Concepts.Sound;
import format.LilyPondFormatter;

import java.util.List;

import static Concepts.Pitch.REST;

public class SoundPhrase extends TimeSerie<Sound>{
    @Override
    public Sound silentValue() {
        return new Pitch(REST);
    }

    public String[] lilyPondVersion(int style) {
        return (new LilyPondFormatter()).format(this,style);
    }

    //----------------------------------------------------------------------------------------------------

    public SoundPhrase transpose(Integer decal){
        SoundPhrase result = new SoundPhrase();
        Sound[] resultHeight = new Sound[this.heights.length];
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





    //-----------------------------------------------------------------------------------------------------
    //
    //  Constructor and builder

    @Override
    public SoundPhrase buildFromList(List<Integer> stepsPosition, List<Sound> values) {
        SoundPhrase result = new SoundPhrase();
        result.stepRanges = new Integer[stepsPosition.size()];
        for (int i = 0; i < stepsPosition.size(); i++) {
            result.stepRanges[i] = stepsPosition.get(i);
        }

        result.heights = new Sound[values.size()];
        for (int i = 0; i < values.size(); i++) {
            result.heights[i]= values.get(i);
        }

        return result;
    }

    public SoundPhrase(){};

    public SoundPhrase(Phrase ph){
        this.heights = new Sound[ph.heights.length];
        for (int i = 0; i < ph.heights.length; i++) {
            this.heights[i] = new Pitch(ph.heights[i]);
        }

        this.stepRanges = new Integer[ph.stepRanges.length];
        for (int i = 0; i < ph.stepRanges.length; i++) {
            this.stepRanges[i] = ph.stepRanges[i];
        }
    }

    public SoundPhrase(Harmony harm){
        this.heights = new Sound[harm.heights.length];
        for (int i = 0; i < harm.heights.length; i++) {
            this.heights[i] =harm.heights[i];
        }

        this.stepRanges = new Integer[harm.stepRanges.length];
        for (int i = 0; i < harm.stepRanges.length; i++) {
            this.stepRanges[i] = harm.stepRanges[i];
        }
    }

}
