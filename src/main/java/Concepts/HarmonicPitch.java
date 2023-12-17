package Concepts;

import java.util.Random;

import static Concepts.Pitch.REST;

public class HarmonicPitch implements Sound{

    int degree;
    int octave;

    public Chord context;
    public  Integer asPitch(){
        int rawPitch = context.pitchs[degree];
        return rawPitch+octave*12;
    }

    public boolean greaterThan(HarmonicPitch p) {
        if (this.asPitch() > p.asPitch())
            return true ;
            else return false;
    }

    public Boolean greaterThan(int indexPitch) {
        if (this.asPitch() > indexPitch)
            return true ;
        else return false;
    }
    public boolean lowerThan(HarmonicPitch p) {
        if (this.asPitch() < p.asPitch())
            return true ;
        else return false;
    }
    public Boolean lowerThan(int indexPitch) {
        if (this.asPitch() < indexPitch)
            return true ;
        else return false;
    }

    public boolean eq(HarmonicPitch p) {
        if (this.asPitch() == p.asPitch())
            return true ;
        else return false;
    }

    @Override
    public String asString() {
        return new Pitch(asPitch()).asString();
    }

    @Override
    public HarmonicPitch silentValue() {
        return new HarmonicPitch(REST,(new Chord()));
    }

    @Override
    public HarmonicPitch transpose(int decal) {
        Chord transposedChord = this.context.transpose(decal);
        return new HarmonicPitch(this.asPitch()+decal,transposedChord);
    }

    public HarmonicPitch makeLowerThan(int indexPitch) {
        // subtract octaves
        int surplusOctave = (this.asPitch()  - indexPitch)/12+1;

        HarmonicPitch result = new HarmonicPitch();
        result.context = this.context;
        result.degree = this.degree;
        result.octave = this.octave-surplusOctave;

        return result;
    }

    public HarmonicPitch makeGreaterThan(int indexPitch) {
        int missingOctaves = (indexPitch-this.asPitch())/12+1;
        //return new Pitch(this.index+missingOctaves*Interval.OCTAVE);

        HarmonicPitch result = new HarmonicPitch();
        result.context = this.context;
        result.degree = this.degree;
        result.octave = this.octave+missingOctaves;

        return result;
    }

    // Be aware that the octave is copied form one pitch to the other.
    // Strange results may occur if the two chords are not close each others.
    public HarmonicPitch changeChord(Chord chord) {

        if (chord.getCardinal() != context.getCardinal())
            throw new RuntimeException(" Error in Harmonic Pitch changeChord : cardinal discrepancy ");
        HarmonicPitch result = new HarmonicPitch();
        result.octave = this.octave;
        result.degree = this.degree;
        result.context = chord;

        return result;
    }

    //---------------------------------------------------------------------------------------------------
    //
    //  arpeggio  of the underlying pitch

    public HarmonicPitch succ(){
        HarmonicPitch result = new HarmonicPitch();
        if (degree == context.pitchs.length-1) {
            result.degree = 0;
            result.octave = octave+1;
        } else {
            result.degree = degree+1;
            result.octave = octave;
        }
        result.context = this.context;
        return result;
    }

    public HarmonicPitch pred(){
        HarmonicPitch result = new HarmonicPitch();
        if (degree == 0) {
            result.degree = context.pitchs.length-1;
            result.octave = octave-1;
        } else {
            result.degree = degree-1;
            result.octave = octave;
        }
        result.context = this.context;
        return result;
    }

    public void prettyPrint(){
        System.out.println(" octave :"+this.octave+" degré :"+this.degree);
    }

    // A inner class for coding the application of succ (positive move) or pred (negative move)
    public static class Move {
        int coding;
        public HarmonicPitch apply(HarmonicPitch hp){
            HarmonicPitch result = hp;
            if (coding > 0) {
                for (int i = 0; i < coding; i++) {
                    result = hp.succ();
                }
            } else {
                for (int i = 0; i <-coding ; i++) {
                    result = hp.pred();
                }
            }
            return result;
        }
        public Move(int coding){
            this.coding = coding;
        }
    }

    //------------------------------------------------------------------------------------------
    //

    // The pitch is supposed correct, i.e reducible to the chord, modulo octave
    public HarmonicPitch(int pitch, Chord context) {
        this.context = context;
        this.degree = -1;
        // Search the degree
        for (int i = 0; i < context.pitchs.length; i++) {
            if ((pitch %12) == (context.pitchs[i]))
                degree = i;
        }
        if (degree==-1)  throw new RuntimeException("pitch out of chord : HarmonicPitch constructor failed");

        // now we can find the octave
        octave = pitch/12 - context.pitchs[degree]/12;
    }

    // choose a pitch in the chord and an octave such that the result is in the pitch constraint
    public HarmonicPitch(Chord context, PitchConstraint pitchConstraint){
        this.context = context;
        degree= (new Random()).nextInt(context.pitchs.length);
        int pitch = context.pitchs[degree];

        // reframe in the pitch constraint and find the octave
        pitch = pitchConstraint.reframe(pitch);
        octave = pitch/12 - context.pitchs[degree]/12;
    }

    public HarmonicPitch(){}
}
