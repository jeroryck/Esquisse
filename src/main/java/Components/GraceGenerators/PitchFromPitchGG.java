package Components.GraceGenerators;

import Concepts.Chord;
import Concepts.Pitch;
import stairCase.Phrase;
import stairCase.PitchPhrase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Concepts.Duration.TRIPLE;
import static Concepts.Interval.*;

public class PitchFromPitchGG {

    //---------------------------------------------------------------------------------------
    //
    //  Grace are (small) phrases constructed form a chord mixed with out of tone pitch

    Chord chordBase;

    // All notes of the grace have the same duration
    Integer timeUnit;

    // For each generated phrase, the base chord could be repeat from one to "maxChord"
    int maxChord;

    // Auxiliary function : determines the out of tone pitch
    // this function could be overridden for generate various type of grace
    public Pitch outOfTone(Integer i){
        Integer[] dissonance = new Integer[] {TRITON,OCTAVE_FLAT,OCTAVE_SHARP};
        List<Integer> result = new ArrayList<>();

        int randomIndex =(int) (Math.random()*(dissonance.length-1));

        return new Pitch(i+ dissonance[randomIndex]);
    }

    // first :Skeleton of one, two or three chordBase chord.
    // second : add a dissonance before and after each chord pitch
    // third : transpose the whole : the root of the chordBase chord becomes the pitch parameter
    public PitchPhrase generate(int pitchBase){
        List<Pitch> listHeight = new ArrayList<>();
        List<Integer> listStep = new ArrayList<>();

        // number of chords
        int chordNumber = (int) ((Math.random() * (maxChord - 1)) + 1);

        // enumeration of the chords using permutation of the chord array
        List<Integer> pitchsChord = new ArrayList<>();
        for (int i = 0; i < chordNumber; i++) {
            for (int j = 0; j < chordBase.pitchs.length; j++) {
                pitchsChord.add(chordBase.pitchs[j]);
            }
        }
        Collections.shuffle(pitchsChord);

        // Grace begins at 0
        listStep.add(0);
        int currentDate = 0;

        // we add the out of tone pitchs
        for (int i = 0; i < pitchsChord.size(); i++) {
            listHeight.add(outOfTone(pitchsChord.get(i)));
            currentDate = currentDate+timeUnit;
            listStep.add(currentDate);
            listHeight.add(new Pitch(pitchsChord.get(i)));
            currentDate = currentDate+timeUnit;
            listStep.add(currentDate);
            listHeight.add(outOfTone(pitchsChord.get(i)));
            currentDate = currentDate+timeUnit;
            listStep.add(currentDate);
        }


        PitchPhrase result = (new PitchPhrase()).buildFromList(listStep,listHeight);
         result = result.transpose(pitchBase-chordBase.pitchs[0]);
        return result;
    }


    public PitchFromPitchGG(Chord chordBase){
        this.chordBase = chordBase;
        this.timeUnit = TRIPLE;
        this.maxChord = 3;
    };

    public PitchFromPitchGG(Chord chordBase, int timeUnit, int maxChord){
        this.chordBase = chordBase;
        this.timeUnit = timeUnit;
        this.maxChord = maxChord;
    }
}
