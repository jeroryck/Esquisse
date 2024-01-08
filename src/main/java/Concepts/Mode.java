package Concepts;

import java.util.ArrayList;
import java.util.List;

public class Mode {

    // A mode is a succession of steps limited inside an octave
    // Each step is a certain number of half tone, i.e. the corresponding increments of a pitch index

    Integer[] steps;

    //---------------------------------------------------------------------------------------------------------
    // Common constants

    public static Mode MAJOR = new Mode(new Integer[]{2,2,1,2,2,2,1});
    public static Mode MINOR = new Mode(new Integer[]{2,1,2,2,1,2,2});

    public static Mode DORIAN = new Mode(new Integer[]{2,1,2,2,2,1,2});

    //---------------------------------------------------------------------------------------------------------
    //
    //  Constructors and builders


    public Mode(Integer[] steps) {
        this.steps = steps;
    }

    // Construct a mode form a 4 parts chord
    // Degree 1,3 and 5 of the scale based on the mode (where tonic is the first pitch class
    // of the chord) must be pitch class in the chord
    public static Mode fromChord4(Chord baseChord){

        // Construction of a seven element list of pitch
        // as the template of a scale of the searched mode
        //----------------------------------------------------


        //  3 possibilities :
        //    a)  3 (scale) = 2 (chord)   5 (scale) = 3 (chord)
        //    b)  3 (scale) = 2 (chord)   5 (scale) = 4 (chord)
        //    c)  3 (scale) = 3 (chord)   5 (scale) = 4 (chord)
        // Possibilities are excluded if interval between chord pitch class
        // is too small for the number of degree of the scale
        //   a) and b) possible only if position 1 and 2 of the chord are further away than 2
        //   c) possible only if position 4 and 5 (octave of the tonic) of the chord further away than 3
        Integer[] caseA =  new Integer[7];
        if (baseChord.pitchs[1]-baseChord.pitchs[0]>=2){
            // case a
            caseA[0]=baseChord.pitchs[0];caseA[2]=baseChord.pitchs[1];caseA[4]=baseChord.pitchs[2];
            // to rework ...
            caseA[1]= caseA[2]-1; caseA[3] = caseA[4]-1;
            caseA[5]=baseChord.pitchs[3];caseA[6]=baseChord.pitchs[0]+11; // octave -1
            // cas b must be investigated
        } else if (baseChord.pitchs[0]+11-baseChord.pitchs[3]>=3){
                // case c
                caseA[0]=baseChord.pitchs[0];caseA[2]=baseChord.pitchs[2];caseA[4]=baseChord.pitchs[3];
                caseA[1]= baseChord.pitchs[1]; caseA[3] = caseA[4]-1;
                caseA[5]=caseA[4]+1; caseA[6]=baseChord.pitchs[0]+11; // octave -1
                }
                else throw new RuntimeException("Mode creation impossible");




        // deduction of the mode from this list
        //------------------------------------

        return null;
    }
}
