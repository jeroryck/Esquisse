package Concepts;

import java.util.Arrays;

import static Concepts.Mode.MAJOR;
import static Concepts.PitchConstraint.VIOLIN_RANGE;

public class ScalePitch implements Movable{

    // A scale pitch is a pitch that can take its value only form a scale.
    // It's possible to go up or down, to walk among the scale

    // The scale the values go from
    private Scale scale;

    // The index of the pitch in the scale.pitches list
    private int index;

    // The octave of the ScalePitch
    public int octave(){
       return scale.pitches.get(index).index/12;
    }

    // The degree of the scale : we retrieve the pitch class and find its index in the pitchClassDegrees of the scale
    public int degree(){
        int pitchClass = scale.pitches.get(index).index%12;
        int degree = Arrays.asList(scale.pitchClassDegrees).indexOf(pitchClass);
        if (degree!=-1) return degree;
        else throw new RuntimeException("error in Scale Pitch degree");
    }

    public Pitch asPitch(){
        return scale.pitches.get(index);
    }

    //-----------------------------------------------------------------------------------------------------------------
    //
    // Implementation of the Movable interface

    @Override
    public Movable succ() {
        ScalePitch result = new ScalePitch();
        if (index < scale.pitches.size()-1) {
            result.scale= this.scale;
            result.index = this.index+1;
            return result;
        }
        else throw new RuntimeException("ScalePitch has no successor "+this.asPitch().asString());
    }

    @Override
    public Movable pred() {
        ScalePitch result = new ScalePitch();
        if (index > 0) {
            result.scale= this.scale;
            result.index = this.index-1;
            return result;
        }
        else throw new RuntimeException("ScalePitch has no predecessor "+this.asPitch().asString());
    }

    //------------------------------------------------------------------------------------------------------------------
    //
    // the  constructor is used by the succ and pred methods
    // Otherwise to create Scale pitch, use the createScalePitch method of the scale class

    private ScalePitch(){}

    public ScalePitch(int octave, int degree,Scale scale){
        this.scale = scale;

        // search of index : the position of the corresponding pitch in the list of pitch of the scale
        int searchIndexPitch = octave*12 + scale.pitchClassDegrees[degree];
        index = -1;
        for (int i = 0; i < scale.pitches.size(); i++) {
            if (scale.pitches.get(i).index == searchIndexPitch) this.index =i;
        }
        if (index==-1) throw new RuntimeException("Bad spec for Scale pitch constraint octave "+octave+" degree "+degree);
    }

    public static void main(String[] args) {

        // Generate D Major
        Scale dMajor= new Scale(MAJOR,2, VIOLIN_RANGE);

       ScalePitch sp = new ScalePitch(4,2,dMajor);
       System.out.println(sp.asPitch().asString());
    }
}
