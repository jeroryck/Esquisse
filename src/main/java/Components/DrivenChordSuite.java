package Components;

import Concepts.Chord;
import stairCase.Harmony;
import stairCase.StaircaseFunction;
import stairCase.TimeSerie;

public class DrivenChordSuite extends ChordSuite{

    // In this specialization of ChordSuite, the base chord and the stepsize depends on the date

    // The series of the base chords
    public Harmony baseChordSeries;
    @Override
    public Chord baseOfChord(int date) {
        return baseChordSeries.getValue(date);
    }

    // The series of the step sizes
    public StaircaseFunction stepSizeSeries;
    @Override
    public Integer stepSize(int date) {
        return stepSizeSeries.getValue(date);
    }

    // The series of the possible moves
    public TimeSerie<Integer[]> possibleMovesSeries;

    @Override
    public Integer[] possibleMoves(int date) {
        return possibleMovesSeries.getValue(date);
    }

    @Override
    public int getMaxTime() {
        return Math.min(baseChordSeries.getMaxTime(),stepSizeSeries.getMaxTime());
    }

    public DrivenChordSuite(Harmony baseChords, StaircaseFunction stepSizes){
        this.baseChordSeries = baseChords;
        this.stepSizeSeries = stepSizes;
    }

    public DrivenChordSuite(){};
}
