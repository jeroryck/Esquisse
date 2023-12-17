package Components.GraceGenerators;

import Concepts.Chord;
import Concepts.Pitch;
import Concepts.Sound;
import stairCase.SoundPhrase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Concepts.Duration.TRIPLE;
import static Concepts.Interval.*;

public class SoundFromPitchGG {

    Chord chordBase;

    // All notes of the grace are multiple of this duration
    Integer timeUnit;

    // For each generated phrase, the base chord could be repeat from one to "maxChord"
    int maxChord;

    // Auxiliary function : determines a out of tone sound from pitch parameter "i"
    // When this method is called, "i" will be a pitch of the base chord
    public Sound outOfTone(Integer i){
        Integer[] dissonance = new Integer[] {TRITON,OCTAVE_FLAT,OCTAVE_SHARP};
        List<Sound> possibilities = new ArrayList<>();
        // First : sound with one pitch
        for (int j = 0; j < dissonance.length; j++) {
            possibilities.add(new Pitch(i+dissonance[j]));
        }

        // Second : sound with 2 pitches
        possibilities.add(new Chord(new Integer[] {i+TRITON, i+OCTAVE_FLAT}));
        possibilities.add(new Chord(new Integer[] {i+TRITON, i+OCTAVE_SHARP}));
        possibilities.add(new Chord(new Integer[] {i, i+OCTAVE_FLAT}));
        possibilities.add(new Chord(new Integer[] {i, i+OCTAVE_SHARP}));
        possibilities.add(new Chord(new Integer[] {i+OCTAVE_FLAT, i+OCTAVE_SHARP}));

        int randomIndex =(int) (Math.random()*(possibilities.size()-1));

        return possibilities.get(randomIndex );
    }

    // first :Skeleton of one, two or three chordBase chord.
    // second : add a dissonance before and after each chord pitch
    // third : transpose the whole : the root of the chordBase chord becomes the pitch parameter
    public SoundPhrase generate(int pitchBase){
        List<Sound> listHeight = new ArrayList<>();
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


        SoundPhrase result = (new SoundPhrase()).buildFromList(listStep,listHeight);
        result = result.transpose(pitchBase-chordBase.pitchs[0]-2*OCTAVE);
        return result;
    }


    public SoundFromPitchGG(Chord chordBase){
        this.chordBase = chordBase;
        this.timeUnit = TRIPLE;
        this.maxChord = 3;
    };

    public SoundFromPitchGG(Chord chordBase, int timeUnit, int maxChord){
        this.chordBase = chordBase;
        this.timeUnit = timeUnit;
        this.maxChord = maxChord;
    }
}
