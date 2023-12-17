package Components.MelodyGenerator;

import Components.SeriesGenerator.SelfReplicator;
import Concepts.*;
import Utils.Alea;
import Utils.TimedIntegerArrayList;
import stairCase.HarmonicPitchPhrase;

import static Components.MelodyGenerator.Walker.Move.*;
import static Concepts.Duration.DOUBLE;

public class Walker {

    //----------------------------------------------------------------------------------------
    //
    // Walk in an harmonic landscape. Melisma between chord tones complete the walk.
    //

    public Chord chordTones;

    // the possible durations of the chord tones in the skeleton of the generated melodies
    // Given in duration unit.
    public int[] longValues = new int[] {2,4,6};

    // Every duration of the melody is a multiple of "durationUnit'
    public Integer durationUnit;

    // ambitus of the walk
    public PitchConstraint ambitus;

    //----------------------------------------------------------------------------------------------------------

    // Generation of a walk with length "duration", from the HarmonyPitch "start"
    // The process relies on cycle of 3 "word", each word is composed of 4 moves in the chord tones.
    // A new cycle is a repetition of the precedent cycle, except an "innovation"
    // i.e a new word.
    // The duration is given in absolute value (i.e not in duration unit)

    int cycleSize;
    int wordSize;

    int innovRate;
    public SelfReplicator autoreplicator;

    enum Move {UPWARD,DOWNWARD, STAND_STILL}

    // for debug

    HarmonicPitchPhrase chordTone;
    // Word of moves in the chord tones. A move is a integer positive or negative
    // For a positive move of i, we apply i times the succ method
    // For a negative move of i, we apply i times the pred method

    public Move[] generateWordMoves(){

        Move[] wordMove = new Move[wordSize];
        Move[] possibleMoves = new Move[] {UPWARD,DOWNWARD};

        for (int i = 0; i < wordSize; i++) {
            wordMove[i] = (Move) Alea.oneOf(possibleMoves);}
        return wordMove;
    }
    public TimedIntegerArrayList generateWordDurations(){

        TimedIntegerArrayList wordDuration = new TimedIntegerArrayList();

        for (int i = 0; i < wordSize; i++) {
            wordDuration.add(Alea.oneOf(longValues)*durationUnit);}
        return wordDuration;
    }

    HarmonicPitch decodeMove(Move move, HarmonicPitch hp){
        HarmonicPitch result = null;
        switch (move) {
            case UPWARD: {result = hp.succ();break;}
            case STAND_STILL: {result = hp ;break;}
            case DOWNWARD: {result = hp.pred() ;break;}
        }
    return result;
    }

    public ListRangedHarmonicPitch generate(HarmonicPitch startPitch, int totalDuration) {

        // Generate a series of words of Move
        //-----------------------------------
        autoreplicator = new
                SelfReplicator<Move[], TimedIntegerArrayList>(cycleSize, innovRate) {
                    @Override
                    public Move[] generateValue() {
                        return generateWordMoves();
                    }

                    @Override
                    public TimedIntegerArrayList generateDuration() {
                        return generateWordDurations();
                    }
                };
        RangedValues wordWalk = autoreplicator.generate(totalDuration);

        // From this series, generate an harmonicPitchPhrase of chord tones
        //-----------------------------------------------------------------

        // 1. flatten the words
        ListRangedValues<Move,Duration> flattenMoves = new ListRangedValues<>();
        for (int i = 0; i < wordWalk.size(); i++) {
            Move[] currentWordValues = (Move[]) wordWalk.getValue(i);
            TimedIntegerArrayList currentWordRanges = (TimedIntegerArrayList) wordWalk.getRange(i);
            for (int j = 0; j < currentWordValues.length; j++) {
                flattenMoves.addValue(currentWordValues[j]);
                flattenMoves.addRange(new Duration(currentWordRanges.get(j)));
            }
        }

        // 2. Play the moves to generate HarmonicPitchs
        ListRangedHarmonicPitch pitchListRange = new ListRangedHarmonicPitch();
        // For the first value, we don't mind the move and set the position to start
        pitchListRange.addValue(startPitch);
        pitchListRange.addRange(flattenMoves.getRange(0));
        for (int i = 1; i < flattenMoves.size(); i++) {
            Move currentMove = (Move) flattenMoves.getValue(i);
            pitchListRange.addValue(decodeMove(currentMove,(HarmonicPitch) pitchListRange.getValue(i-1)));
            pitchListRange.addRange(flattenMoves.getRange(i));
        }

        return pitchListRange;
    }

    //-------------------------------------------------------------------------------------------------

    public Walker(int cycleSize, int innovRate, int wordSize){
        this.cycleSize = cycleSize;
        this.innovRate = innovRate;
        this.wordSize = wordSize;
    }

    //-----------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Walker walker = new Walker(4,1,3);
        walker.durationUnit = DOUBLE;
        Chord chordTones = new Chord(new String[]{"c'", "ees'","aes'","b'"});
        HarmonicPitch start = new HarmonicPitch(Pitch.asInt("c''"), chordTones);
        ListRangedValues<HarmonicPitch,Duration> generated = walker.generate(start,1000);

        for (int i = 0; i < generated.size(); i++) {
            HarmonicPitch currentPitch = (HarmonicPitch) generated.getValue(i);
            System.out.println(Pitch.asString(currentPitch.asPitch()));
        }

    }
}
