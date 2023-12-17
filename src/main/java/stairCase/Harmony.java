package stairCase;

import Concepts.Chord;
import Concepts.PitchConstraint;
import format.LilyPondFormatter;

import java.util.List;

public class Harmony extends TimeSerie<Chord> {

    public Chord silentValue(){
        return Chord.silentChord(chordCardinal);
    }

    // the number of notes of the chords -> implicitly all the chords have the same number of notes
    public int chordCardinal;

    // the range allowed for the pitches of the chords
    PitchConstraint range;
    public PitchConstraint getRange() {
        return range;}
    public void setRange(PitchConstraint range) {
        this.range = range;}

    public Phrase[] asPhrases(){
        Phrase[] phrases = new Phrase[chordCardinal];

        for (int j = 0; j < chordCardinal; j++) {
            phrases[j]= new Phrase();
            phrases[j].heights = new Integer[heights.length];
            phrases[j].stepRanges = new Integer[this.stepRanges.length];
            System.arraycopy(stepRanges, 0, phrases[j].stepRanges, 0, stepRanges.length);
        }

        for (int i = 0; i < this.heights.length; i++) {
            for (int j = 0; j < chordCardinal; j++) {
                phrases[j].heights[i]= this.heights[i].pitchs[j];
            }
        }

        return  phrases ;
    }

    public String[] lilyPondVersion(int style) {

        return (new LilyPondFormatter()).format(this,style);
    }

    //---------------------------------------------------------------------------------------------------------
    //
    //  Constructors and builders

    public Harmony buildFromList(List<Integer> stepsPosition, List<Chord> values){
          Harmony result = new Harmony();

          result.stepRanges = new Integer[stepsPosition.size()];
        for (int i = 0; i < stepsPosition.size(); i++) {
            result.stepRanges[i] = stepsPosition.get(i);
        }

        result.heights = new Chord[values.size()];
        for (int i = 0; i < values.size(); i++) {
            result.heights[i]= values.get(i);
        }
        result.chordCardinal = this.chordCardinal;
        result.range = this.range;

          return result;
    }
    public Harmony(Chord[] heights, Integer[] stepRanges) {
        if (heights == null || stepRanges == null ||
                heights.length != (stepRanges.length-1) || heights.length == 0) {
            throw new IllegalArgumentException("Invalid input arrays.");
        }

        this.heights = heights.clone();
        this.stepRanges = stepRanges.clone();
    }


    public Harmony() {
    }
}
