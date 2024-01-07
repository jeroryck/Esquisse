package Concepts;

import java.util.ArrayList;
import java.util.List;

import static Concepts.Mode.MAJOR;
import static Concepts.PitchConstraint.PIANO_RANGE;

public class Scale {

    // Scale is created from a mode and a pitch class (a pitch modulo 12)
    private Mode mode;
    private int tonic;

    // the pitch class of each degree of the scale
    int[] pitchClassDegrees;
    // Initialisation method, using the interval pattern of the mode
    private void populateDegrees(){
        pitchClassDegrees = new int[mode.steps.length+1];
        pitchClassDegrees[0] = tonic;
        for (int i = 1; i < pitchClassDegrees.length; i++) {
            pitchClassDegrees[i] = pitchClassDegrees[i-1]+mode.steps[i-1];
        }
    }

    //-------------------------------------------------------------------------------------------------

    // The list of all the pitches of the scale, inside the ambitus. Default value of the ambitus is piano range, i.e. maximal
    // practical range. This list is constructed with the populate method.
    List<Pitch> pitches = new ArrayList<>();
    PitchConstraint ambitus = PIANO_RANGE;
    public void setAmbitus(PitchConstraint newAmbitus){
        ambitus = newAmbitus;
        populatePitches();
    }

    private void populatePitches(){

        // from the lowest value to the highest
        int octave= -1;
        int indexDegree = 0;
        int pitchIndex = octave*12+ pitchClassDegrees[indexDegree];
        while (pitchIndex <= ambitus.upperBound) {
            if (pitchIndex >= ambitus.lowerBound) pitches.add(new Pitch(pitchIndex));
            if (indexDegree== pitchClassDegrees.length-1) {
                indexDegree = 1; octave++;
            } else indexDegree++;
            pitchIndex = octave*12+ pitchClassDegrees[indexDegree];
        }
    }

    //---------------------------------------------------------------------------------------------------------
    //


    public Scale(Mode mode, int pitchClass){
        this.mode = mode;
        if ((pitchClass<0)||(pitchClass>11)) throw new RuntimeException("Bad pitch class in Scale creation :"+pitchClass);
        this.tonic = pitchClass;
        populateDegrees();
        populatePitches();
    }

    public Scale(Mode mode, int pitchClass,PitchConstraint ambitus){
        this.mode = mode;
        if ((pitchClass<0)||(pitchClass>11)) throw new RuntimeException("Bad pitch class in Scale creation :"+pitchClass);
        this.tonic = pitchClass;
        this.ambitus = ambitus;
        populateDegrees();
        populatePitches();
    }

    public static void main(String[] args) {

        // Generate D Major
        Scale scale = new Scale(MAJOR,2);

        for (int i = 0; i < scale.pitches.size(); i++) {
            System.out.println(scale.pitches.get(i).asString());
        }
    }
}
