package Concepts;

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
    public Mode(Integer[] steps) {
        this.steps = steps;
    }
}
