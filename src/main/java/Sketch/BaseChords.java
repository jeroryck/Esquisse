package Sketch;


//
//  Generation of a chord Time series, which will stands for the base harmony of the whole piece.
// This series is build from a "baseOfChord", transposed following a set
//  of "possibleMoves". Each move is selected in respect of a "range".
//
//  The duration of each chord is "stepSize" multiplied by "unitValue" (inherited from "Harmony"). "stepSize" can be
//  modulated as "unitValue" remains unmodified.

//  These operation take place in "populate"
//

import Concepts.Chord;
import Concepts.PitchConstraint;
import stairCase.Harmony;

import java.util.Random;

import static Concepts.Pitch.asInt;

public class BaseChords extends Harmony {

    Chord baseOfChord ;
    public Chord getBaseOfChord() {
        return baseOfChord;
    }
    public void setBaseOfChord(Chord baseChord) {
        this.baseOfChord = baseChord;
    }
    public  void setBaseChord(String[] notes){
        Integer[] pitchs = new Integer[notes.length];
        for (int i = 0; i < notes.length; i++) {
            pitchs[i] = asInt(notes[i]);
        }
        baseOfChord = new Chord(pitchs);
    }

    Integer stepSize;
    public Integer getStepSize() {
        return stepSize;
    }
    public void setStepSize(Integer stepLength) {
        this.stepSize = stepLength;
    }



    Integer[] possibleMoves ;
    public Integer[] getPossibleMoves() {
        return possibleMoves;}

    public void setPossibleMoves(Integer[] possibleMoves) {
        this.possibleMoves = possibleMoves;}

    Integer numberStepMax;

    //--------------------------------------------------------------------------------------------------------

    public void populate(){

        Random random = new Random();

        // first values
        heights[0]=baseOfChord;
        stepRanges[0]= 0;
        stepRanges[1]=stepSize;

        // next values
        Chord candidate = null;
        for (int i = 1; i < numberStepMax; i++) {
            Boolean succes = false;
            while (succes==false) {
                int randomIndex = random.nextInt(possibleMoves.length - 1);
                candidate = heights[i - 1].transpose(possibleMoves[randomIndex]);
                if (getRange().contains(candidate)) succes = true;
            }
            heights[i]=candidate;
            stepRanges[i+1]= stepRanges[i]+stepSize;
        }
    }

    //--------------------------------------------------------------------------------------------------

    public BaseChords(int stepNumber,
                      int stepSize,
                      PitchConstraint range,
                      String[] baseOfChord,
                      Integer[] possibleMoves){

        this.heights = new Chord[stepNumber];
        this.stepRanges = new Integer[stepNumber+1];
        numberStepMax = stepNumber;
        this.stepSize = stepSize;
        this.setRange(range);

        // the parameter basChord is an array of string names of pitch
        setBaseChord(baseOfChord);
        chordCardinal = getBaseOfChord().pitchs.length;

        setPossibleMoves(possibleMoves);
    }
}
