package stairCase;

import Concepts.Chord;

import java.util.List;

    // Mask is used for editing : if mask is true, the edited value is preserved, if mask is false,
    // the edited value is set to "silentValue" : cf. TimeSerie.edit

public class Mask extends TimeSerie<Boolean>{



    @Override
    public Boolean silentValue() {
        return false;
    }

    @Override
    public TimeSerie buildFromList(List<Integer> stepsPosition, List<Boolean> values) {
        Mask result = new Mask();

        result.stepRanges = new Integer[stepsPosition.size()];
        for (int i = 0; i < stepsPosition.size(); i++) {
            result.stepRanges[i] = stepsPosition.get(i);
        }

        result.heights = new Boolean[values.size()];
        for (int i = 0; i < values.size(); i++) {
            result.heights[i]= values.get(i);
        }




        return result;
    }

}
