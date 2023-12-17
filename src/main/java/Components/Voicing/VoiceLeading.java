package Components.Voicing;

import Concepts.Chord;
import Concepts.Pitch;
import Concepts.PitchConstraint;
import stairCase.Harmony;

import java.util.ArrayList;
import java.util.List;

import static Concepts.Interval.OCTAVE;

public class VoiceLeading {

    // From a chord series ("Harmony"), generate a new series of voicings of the chords, minimizing the
    // distance between consecutive chords, giving the first voicing
    // Avoidance of // fifth is implemented




    // Detect ugly parallel fifth
    public boolean hasParralelism(Chord chordOne, Chord chordTwo){

        boolean result = false;
        // 1. search for fifth in chordOne
        // nb : -1 for the first loop because we must have two positions for fifth testing
        for (int i = 0; i < chordOne.pitchs.length-1; i++) {
            for (int j = i; j < chordOne.pitchs.length; j++) {
                if ((chordOne.pitchs[j]-chordOne.pitchs[i])==7) {
                    // 2. Gotcha ! test if there is also a fifth in the second chord
                    if ((chordTwo.pitchs[j] - chordTwo.pitchs[i]) == 7) result = true;
                }
            }
        }
        return result;
    }

    //---------------------------------------------------------------------------------------------------------
    //
    //  Generate the different positions of a chord

    // Auxiliary function : successor (next upper pitch) of the ith ("index") pitch of a chord
    private int succ(int index, Chord chord){
        if (index <= chord.pitchs.length-2)
            return chord.pitchs[index+1];
            else if (index == chord.pitchs.length-1)
                return chord.pitchs[0]+OCTAVE;
            else throw new RuntimeException("function succ in VoiceLeading : bad index");
    }

    // idem, but giving the next lower pitch
    private int pred(int index, Chord chord){
        if (index>0)
            return chord.pitchs[index-1];
        else if (index ==0)
            return chord.pitchs[chord.pitchs.length-1]-OCTAVE;
            else throw new RuntimeException("function pred in VoiceLeading : bad index");
    }

    // Change the position of a chord
    public Chord nextUpperPosition(Chord chord){
        Chord newChord = new Chord();
        newChord.pitchs = new Integer[chord.pitchs.length];

        for (int i = 0; i < chord.pitchs.length; i++) {
            newChord.pitchs[i] = succ(i,chord);
        }
        return  newChord;
    }

    public Chord nextLowerPosition(Chord chord){
        Chord newChord = new Chord();
        newChord.pitchs = new Integer[chord.pitchs.length];

        for (int i = 0; i < chord.pitchs.length; i++) {
            newChord.pitchs[i] = pred(i,chord);
        }
        return  newChord;
    }

    //----------------------------------------------------------------------------------------------------
    //
    // Core method

    public Harmony voiceLead(Harmony harmony){


        Harmony voicedHarm = new Harmony();
        voicedHarm.stepRanges = new Integer[harmony.stepRanges.length];
        System.arraycopy(harmony.stepRanges,0,voicedHarm.stepRanges,0,harmony.stepRanges.length);
        voicedHarm.heights = new Chord[harmony.heights.length];
        voicedHarm.chordCardinal = harmony.chordCardinal;

        // first chord is not changed
        voicedHarm.heights[0]=harmony.heights[0];

        // the following chords are looked at in relation to the previous ones
        for (int i = 1; i < harmony.heights.length; i++) {

            Chord toProceed = harmony.heights[i];
            Chord predecessor = voicedHarm.heights[i-1];

            // 1. Generate the possible chords, i.e all positions of the chord to proceed
            List<Chord>  possibilities = new ArrayList<>();
            possibilities.add(toProceed);
            Chord currentPossibility = toProceed;
            // Upper positions
            for (int j = 0; j < toProceed.pitchs.length ; j++) {
                Chord newPossibility = nextUpperPosition(currentPossibility);
                possibilities.add(newPossibility);
                currentPossibility = newPossibility;
            }
            // Lower positions
            currentPossibility = toProceed;
            for (int j = 0; j < toProceed.pitchs.length ; j++) {
                Chord newPossibility = nextLowerPosition(currentPossibility);
                possibilities.add(newPossibility);
                currentPossibility = newPossibility;
            }

           // System.out.println("predecesseur "+predecessor.asString());
            //for (int j = 0; j < possibilities.size(); j++) {
            //    System.out.println("possibilité "+possibilities.get(j).asString());
            //    System.out.println("distance "+chordDistance(predecessor,possibilities.get(j)));
            //    System.out.println("// "+hasParralelism(predecessor,possibilities.get(j)));
            //}


            //3. Choose the closest

            Chord voiced = null;

            int distance = Integer.MAX_VALUE;
            for (int j = 0; j < possibilities.size(); j++) {
                Chord possible = possibilities.get(j);
                if ((predecessor.chordDistance(possible)<distance)&&(!hasParralelism(predecessor,possible))) {
                    voiced = possible;
                    distance = predecessor.chordDistance(possible);

                }
            }

            //System.out.println(" retenu :"+voiced.asString() );
            //System.out.println("---------------------------------");

        voicedHarm.heights[i]= voiced;
        }
        return voicedHarm;
    }

    //------------------------------------------------------------------------------------------------------------



    public VoiceLeading(){}

    //-----------------------------------------------------------------------------------------------------------
    //
    //  Test

    public static void main(String[] args) {

        Chord testChord = new Chord(new String[]{"c'  ","e'  ","g ' ","c'' "});
        VoiceLeading vl = new VoiceLeading();

        // Generate and print the different positions
        Harmony harm = new Harmony();
        harm.heights = new Chord[2*testChord.pitchs.length];
        harm.stepRanges = new Integer[2+(testChord.pitchs.length-1)*2];

        harm.heights[0] = testChord;
        harm.stepRanges[0] = 0;

        for (int i = 1; i < 2*testChord.pitchs.length; i++) {
            harm.heights[i] = vl.nextUpperPosition(harm.heights[i-1]);
            harm.stepRanges[i] = harm.stepRanges[i-1] +32;
        }

        for (int i = 0; i <2*testChord.pitchs.length; i++) {
            System.out.println(harm.heights[i].asString());
        }
    }

}
