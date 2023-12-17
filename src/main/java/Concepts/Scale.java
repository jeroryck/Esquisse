package Concepts;

import java.util.*;
import java.util.function.Predicate;

import static Concepts.PitchConstraint.ALTO_RANGE;
import static Concepts.Scale.Way.UP;

public class Scale  {

    PitchConstraint ambitus;

    enum Way {UP,DOWN};


    public List<Pitch> pitchesUp = new ArrayList<>();
    public List<Pitch> pitchesDown = new ArrayList<>();

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
    public List<Pitch> expandChord(Chord chord){

        List<Pitch> result = new ArrayList<>();

        // Harmonic pitch to walk through the ambitus
        HarmonicPitch hpWalk = new HarmonicPitch(chord.getRoot(),chord);
        while (hpWalk.lowerThan(ambitus.upperBound)){
            if(hpWalk.greaterThan(ambitus.lowerBound))
                result.add(new Pitch(hpWalk.asPitch()));
            hpWalk = hpWalk.succ();
        }

        return result;
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
        List<Pitch> skeletton = expandChord(chord);

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


    public Scale(PitchConstraint ambitus) {
        this.ambitus = ambitus;
    }

    public static void main(String[] args) {

        Scale scale = new Scale(ALTO_RANGE);
        Chord chordTones = new Chord(new String[]{"c'", "ees'","aes'","b'"});
        scale.populate(chordTones);

        System.out.println("Ascending");
        for (int i = 0; i < scale.pitchesUp.size(); i++) {
            System.out.println(scale.pitchesUp.get(i).asString());
        }
        System.out.println("Descending");
        for (int i = 0; i < scale.pitchesDown.size(); i++) {
            System.out.println(scale.pitchesDown.get(i).asString());
        }
    }
}
