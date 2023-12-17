package stairCase;

import Concepts.Chord;

import java.util.List;

public class IntegersTimeSerie extends TimeSerie<Integer[]> {

    // All the arrays which are elements of the series must have the same size
    @Override
    public Integer[] silentValue() {
        return new Integer[0];
    }

    @Override
    public TimeSerie buildFromList(List<Integer> stepsPosition, List<Integer[]> values) {
        IntegersTimeSerie result = new IntegersTimeSerie() ;

        // All values are arrays of the same size. We take for instance the size of the first.
        int elementSize = values.get(0).length;


        result.stepRanges = new Integer[stepsPosition.size()];
        for (int i = 0; i < stepsPosition.size(); i++) {
            result.stepRanges[i] = stepsPosition.get(i);
        }

        result.heights = new Integer[values.size()][elementSize];
        for (int i = 0; i < values.size(); i++) {
            result.heights[i]= values.get(i);
        }


        return result;
    }
}
