package Concepts;

import java.util.ArrayList;
import java.util.List;

import static Concepts.PitchConstraint.ALTO_RANGE;

public class Arpeggio  {

    // construct an arpeggio of harmonic pitchs, from the lower to the upper bound of the ambitus.

    PitchConstraint ambitus;

    Chord baseChord;

    // List of pitch, sorted  from the lower to the upper
    public List<Pitch> pitches = new ArrayList<>();

    // Construct of an arpeggio of a chord
    public void populate(){

        // Harmonic pitch to walk through the ambitus
        HarmonicPitch hpWalk = new HarmonicPitch(baseChord.getRoot(),baseChord);

        // Upward, starting from the root
        while (hpWalk.lowerThan(ambitus.upperBound)){
            if(hpWalk.greaterThan(ambitus.lowerBound))
                pitches.add(new Pitch(hpWalk.asPitch()));
            hpWalk = hpWalk.succ();
        }

        //Downward (we skip the root, already in the ascending walk)
        hpWalk = new HarmonicPitch(baseChord.getRoot(),baseChord);
        hpWalk = hpWalk.pred();
        while (hpWalk.greaterThan(ambitus.lowerBound)){
            if(hpWalk.lowerThan(ambitus.upperBound))
                pitches.add(0, new Pitch(hpWalk.asPitch()));
            hpWalk = hpWalk.pred();
        }

    }

    //-------------------------------------------------------------------------------------------------------------

    public Arpeggio(PitchConstraint pitchConstraint, Chord chord) {
        ambitus = pitchConstraint;
        baseChord = chord;
    }

    public static void main(String[] args) {

        Chord chordTones = new Chord(new String[]{"c''", "ees''","aes''","b''"});
        Arpeggio arpeggio = new Arpeggio(ALTO_RANGE, chordTones);
        arpeggio.populate();
        System.out.println("lower bound :"+(new Pitch(arpeggio.ambitus.lowerBound)).asString());
        System.out.println("Arpeggio :");
        for (int i = 0; i < arpeggio.pitches.size(); i++) {
            System.out.println(arpeggio.pitches.get(i).asString());
        }
        System.out.println("upper bound :"+(new Pitch(arpeggio.ambitus.upperBound)).asString());
    }
}

