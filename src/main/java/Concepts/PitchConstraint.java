package Concepts;

import stairCase.HarmonicPitchPhrase;
import stairCase.Phrase;
import stairCase.TimeSerie;

public class PitchConstraint {

    // Stands for the interval a pitch should be in
    public int lowerBound;
    public int upperBound;

    //-----------------------------------------------------------------------------------------------
    //
    // Some useful constants

    public static PitchConstraint VIOLIN_RANGE = new PitchConstraint("g","g'''");
    public static PitchConstraint ALTO_RANGE = new PitchConstraint("c","c'''");
    public static PitchConstraint CELLO_RANGE = new PitchConstraint("c,","g''");
    public static PitchConstraint PIANO_RANGE = new PitchConstraint("a,,,","b''''");

    //------------------------------------------------------------------------------------------------------

    public boolean contains(int pitchValue) {
        return ((lowerBound<= pitchValue) && (pitchValue <= upperBound));
    }

    public boolean contains(Chord chord){

        Boolean result = true;
        for (int i = 0; i < chord.pitchs.length; i++) {
            result = result && contains(chord.pitchs[i]);
        }
        return result;
    }

    public void print() {
        System.out.println("Pitch constraint : "+Pitch.asString(lowerBound)+" "+Pitch.asString(upperBound));
    }

    //-------------------------------------------------------------------------------------------------------
    //
    // Reframe, i.e modify octave position to bring back a Sound or a TimeSerie in the bound of a pitch constraint

    public int reframe(int pitchIndex){
        if (contains(pitchIndex))
            //nothing to do
            return pitchIndex;
        else if (pitchIndex < lowerBound){
            //add octaves
            int missingOctaves = (lowerBound-pitchIndex)/12+1;
            return pitchIndex+missingOctaves*Interval.OCTAVE;

        } else {
            // subtract octaves
            int surplusOctave = (pitchIndex - upperBound)/12+1;
            return pitchIndex-surplusOctave*Interval.OCTAVE;
        }
    }

    public Sound reframe(Sound s){
         if (s.lowerThan(lowerBound)){
            //add octaves
            return s.makeGreaterThan(lowerBound);

        }
         if (s.greaterThan(upperBound)) {
            // subtract octaves
            return s.makeLowerThan(upperBound);
        };
        return s;
    }

    public HarmonicPitch reframe(HarmonicPitch hp){
        if (hp.lowerThan(lowerBound)){
            //add octaves
            return hp.makeGreaterThan(lowerBound);

        }
        if (hp.greaterThan(upperBound)) {
            // subtract octaves
            return hp.makeLowerThan(upperBound);
        };
        return hp;
    }

    public void reframe(TimeSerie<Sound> ph){

        for (int i = 0; i < ph.heights.length; i++) {
            ph.heights[i] = reframe(ph.heights[i]);
        }
    }

    public void reframe(HarmonicPitchPhrase ph){

        for (int i = 0; i < ph.heights.length; i++) {
            ph.heights[i] = reframe(ph.heights[i]);
        }
    }

    //----------------------------------------------------------------------------------------------------------
    //

    public PitchConstraint (int lower, int upper){
        lowerBound = lower;
        upperBound = upper;
    }

    public PitchConstraint(String lower, String upper){
        lowerBound = Pitch.asInt(lower);
        upperBound =Pitch.asInt(upper);
    }

    //----------------------------------------------------------------------------------------------------------
    //
    //

    public static void main(String[] args) {
        PitchConstraint altoRange = new PitchConstraint("c", "c '''");

        System.out.println("Etendue de l'alto :"+altoRange.lowerBound+" -> "+altoRange.upperBound);

        Chord chord = new Chord(new String[]{"cis'", "e'", "aes'"});
        PitchConstraint range = new PitchConstraint("c''", "c '''");

        Chord reframed = (Chord) range.reframe(chord);
        reframed.prettyPrint();
    }



}
