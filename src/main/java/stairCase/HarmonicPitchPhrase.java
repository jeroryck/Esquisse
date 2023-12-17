package stairCase;

import Concepts.HarmonicPitch;
import Concepts.Pitch;
import Concepts.Sound;

import java.util.List;

public class HarmonicPitchPhrase extends TimeSerie<HarmonicPitch>{
    @Override
    public HarmonicPitch silentValue() {
        return null;
    }

    @Override
    public HarmonicPitchPhrase buildFromList(List<Integer> stepsPosition, List<HarmonicPitch> values) {
        HarmonicPitchPhrase result = new HarmonicPitchPhrase();

        result.stepRanges = new Integer[stepsPosition.size()];
        for (int i = 0; i < stepsPosition.size(); i++) {
            result.stepRanges[i] = stepsPosition.get(i);
        }

        result.heights = new HarmonicPitch[values.size()];
        for (int i = 0; i < values.size(); i++) {
            result.heights[i]= values.get(i);
        }

        return result;
    }

    public PitchPhrase asPitchPhrase(){
        PitchPhrase result = new PitchPhrase();

        result.stepRanges = new Integer[this.stepRanges.length];
        for (int i = 0; i < this.stepRanges.length; i++) {
            result.stepRanges[i] = this.stepRanges[i];
        }

        result.heights = new Pitch[this.heights.length];
        for (int i = 0; i < this.heights.length; i++) {
            result.heights[i] = new Pitch(heights[i].asPitch());
        }

        return result;
    }

    public HarmonicPitchPhrase(){}
}
