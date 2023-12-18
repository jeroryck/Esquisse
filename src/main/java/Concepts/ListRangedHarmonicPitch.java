package Concepts;

import format.LilyPondFormatter;
import stairCase.SoundPhrase;

public class ListRangedHarmonicPitch extends ListRangedValues<HarmonicPitch,Duration> {

    public String[] lilyPondVersion(int style) {
        return (new LilyPondFormatter()).format(this,style);
    }

    public SoundPhrase asSoundPhrase() {
        SoundPhrase result = new SoundPhrase();
        result.heights = new Sound[size()];
        result.stepRanges = new Integer[size()+1];

        for (int i = 0; i < valueList.size(); i++) {
            result.heights[i] = new Pitch(((HarmonicPitch) valueList.get(i)).asPitch());
        }
        result.stepRanges[0]=0;
        for (int i = 0; i < rangeList.size(); i++) {
            result.stepRanges[i+1] = rangeList.get(i).intValue + result.stepRanges[i];
        }

        return result;
    }
}
