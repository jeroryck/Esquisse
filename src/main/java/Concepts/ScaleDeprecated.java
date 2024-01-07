package Concepts;

import java.util.*;
import java.util.function.Predicate;

import static Concepts.PitchConstraint.ALTO_RANGE;

public class ScaleDeprecated {

    PitchConstraint ambitus;

    Chord baseChord;

    enum Way {UP,DOWN};


    // Enumeration of the ascending scale
    public List<Pitch> pitchesUp = new ArrayList<>();

    // Enumeration (upward) of the descending scale
    public List<Pitch> pitchesDown = new ArrayList<>();

    // The index in the ascending scale of a given pitch (undefined if the pitch is not in the scale)
    public Optional<Integer> degreeUp(Pitch pitch) {

        Optional<Integer> degree =Optional.empty();
        for (int i = 0; i < pitchesUp.size(); i++) {
            if (pitchesUp.get(i).index == pitch.index) {
                degree = Optional.of(i);
                break;
            }
        }
        return  degree;
    }

    public Optional<Integer> degreeDown(Pitch pitch) {

        Optional<Integer> degree =Optional.empty();
        for (int i = 0; i < pitchesDown.size(); i++) {
            if (pitchesDown.get(i).index == pitch.index) {
                degree = Optional.of(i);
                break;
            }
        }
        return  degree;
    }

    public boolean containsUpWay(Pitch pitch){

        Predicate<Pitch> hasSameIndex = p -> p.index == pitch.index;
        Optional<Pitch> foundPitch = pitchesUp.stream().filter(hasSameIndex).findFirst();

        if (foundPitch.isPresent()) return true; else return false;
    }

    public boolean containsDownWay(Pitch pitch){

        Predicate<Pitch> hasSameIndex = p -> p.index == pitch.index;
        Optional<Pitch> foundPitch = pitchesDown.stream().filter(hasSameIndex).findFirst();

        if (foundPitch.isPresent()) return true; else return false;
    }

    //---------------------------------------------------------------------------------------------------------
    //
    //  Construction of the pitch list

    // Construct of an arpeggio of a chord
    public List<Pitch> expandChord(){

        Arpeggio arpeggio = new Arpeggio(ambitus,baseChord);
        arpeggio.populate();

        return arpeggio.pitches;
    }

    // Extrapolation of the scale between two consecutive chord tones.
    // the first chord tone is excluded, the second included
    public List<Pitch> extrapolateUp(Pitch first, Pitch second){

        List<Pitch> result = new ArrayList<>();
        int index = first.index+2;

        while (index <= second.index){
            result.add(new Pitch(index));
            index = index+2;
        }

        // add the second, if not reached yet
        if (index == second.index+1)
            result.add(second);

        return result;
    }
    public List<Pitch> extrapolateDown(Pitch first, Pitch second){

        List<Pitch> result = new ArrayList<>();
        int index = second.index -2;

        while (index >= first.index){
            result.add(new Pitch(index));
            index = index-2;
        }

        // add the first, if not reached yet
        if (index == first.index-1)
            result.add(first);

        Collections.reverse(result);
        return result;
    }

    public void populate(Chord chord){

        // Firstly we construct the arpeggio of the chord
        List<Pitch> skeletton = expandChord();

        // Then we expand the scale between each pitch of the arpeggio
        if (skeletton.size()<=2)
            throw new RuntimeException("ambitus too small for scale populate");
        ListIterator<Pitch> skelIter = skeletton.listIterator();
        Pitch first = skelIter.next();
        Pitch second;
        pitchesUp.add(first);

        while (skelIter.hasNext()) {
            second = skelIter.next();
            pitchesDown.addAll(extrapolateDown(first,second));
            pitchesUp.addAll(extrapolateUp(first,second));
            first = second;
        }
        pitchesDown.add(skeletton.get(skeletton.size()-1));
    }

    //------------------------------------------------------------------------------------------------------------

    public ScaleDeprecated(PitchConstraint ambitus, Chord baseChord) {

        this.ambitus = ambitus;
        this.baseChord = baseChord;
    }

    public static void main(String[] args) {


        Chord chordTones = new Chord(new String[]{"c'", "ees'","aes'","b'"});
        ScaleDeprecated scale = new ScaleDeprecated(ALTO_RANGE, chordTones);
        scale.populate(chordTones);

        System.out.println("Ascending");
        for (int i = 0; i < scale.pitchesUp.size(); i++) {
            System.out.println(scale.pitchesUp.get(i).asString());
        }
        System.out.println("Descending");
        System.out.println("lower bound :"+(new Pitch(scale.ambitus.lowerBound)).asString());
        for (int i = 0; i < scale.pitchesDown.size(); i++) {
            System.out.println(scale.pitchesDown.get(i).asString());
        }
        System.out.println("upper bound :"+(new Pitch(scale.ambitus.upperBound)).asString());
    }
}
