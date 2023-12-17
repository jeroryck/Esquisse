package Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Concepts.Interval.OCTAVE;
import static Concepts.Pitch.REST;
import static Concepts.Pitch.asInt;

public class Chord implements Sound {

    // data structure
    public Integer[] pitchs ;

    public Chord transpose(int decal){
        Integer[] newPitchs = new Integer[pitchs.length];
        for (int j = 0; j < pitchs.length; j++) {
            newPitchs[j] = pitchs[j]+decal;
        }
        return new Chord(newPitchs);
    }

    @Override
    public Sound makeLowerThan(int indexPitch) {
        if (pitchs[pitchs.length-1] > indexPitch) {
            // subtract octaves
            int surplusOctave = (pitchs[pitchs.length - 1] - indexPitch) / 12 + 1;
            return transpose(-surplusOctave * Interval.OCTAVE);
        } else return this;
    }

    @Override
    public Sound makeGreaterThan(int indexPitch) {
        if (getRoot() < indexPitch) {
            // add octaves
            int missingOctaves = (indexPitch - getRoot()) / 12 + 1;
            return transpose(missingOctaves * OCTAVE);
        } else return this;
    }

    @Override
    public Boolean lowerThan(int indexPitch) {
        return (getRoot() < indexPitch);
    }

    @Override
    public Boolean greaterThan(int indexPitch) {
        return (pitchs[pitchs.length-1] > indexPitch);
    }



    public int getRoot() {return pitchs[0];}

    public int getCardinal() {return pitchs.length;}

    public Chord setRoot(int expectedRoot){
        int decal = expectedRoot - getRoot();
        return transpose(decal);
    }

    public static Chord silentChord(int chordCardinal) {
          Chord result = new Chord();
          result.pitchs = new Integer[chordCardinal];
          for (int i = 0; i < result.pitchs.length; i++) {
             result.pitchs[i] = REST;
          }
          return result;
    }

    @Override
    public Sound silentValue() {
        return Chord.silentChord(this.pitchs.length);
    }

    // Estimation of the "distance" of two chords : small distance leads to smooth liking between the two chords
    public int chordDistance(Chord chord){

        // NB : We assume the two chords have the same number of notes
        int distance = 0;
        for (int i = 0; i < this.pitchs.length; i++) {
            distance = distance + Math.abs(this.pitchs[i]-chord.pitchs[i]);
        }
        return distance;
    }

    // Give from a list the chord wich minimize the distance to a given chord
    public Chord minimizeChordDistance(List<Chord> lChords) {
        int distance = Integer.MAX_VALUE;
        Chord closest = lChords.get(0);

        for (int i = 1; i < lChords.size(); i++) {
            int distanceToNewChord = chordDistance(lChords.get(i));
            if (distanceToNewChord<distance){
                closest = lChords.get(i);
                distance = distanceToNewChord;
            }
        }
        return closest;
    }



    //-----------------------------------------------------------------------------------------------------------

    // Auxiliary function : try to add to a chord a new note in a given list.
    // the operation succeed if the new note is upon the upper note of the chord
    // the function give the list of the chords successfully built.
    private List<Chord> addNotes(List<Integer> notes){
        List<Chord> result = new ArrayList<>();
        for (Integer note: notes) {
            if (note >= pitchs[pitchs.length-1]) {
                //Gotcha ! We construct a new chord and add it into the result
                Integer[] augmentedPitchs = new Integer[pitchs.length+1];
                System.arraycopy(pitchs,0, augmentedPitchs,0,pitchs.length);
                augmentedPitchs[augmentedPitchs.length-1]=note;
                result.add(new Chord(augmentedPitchs));
            }

        }
        return result;
    }


    // Construction of voicing : the result is the set of all voicing of the called object,
    // in respect of the constraints
    // The ith constraint is applied to the ith pitch
    public  List<Chord> constructsVoicing(  List<PitchConstraint> constraints){


        if (pitchs.length != constraints.size()) {
            System.out.println("voicing error : lenght of pitchs is "+pitchs.length+
                               " and length of constraints is "+constraints.size());
            return null ;
        }


        List<Chord> result = new ArrayList<>();
        if (pitchs.length==1){
            List<Integer> notesToAdd = Pitch.octavian(pitchs[0],constraints.get(0));
            for (Integer note: notesToAdd) {
                Integer[] newPitches = new Integer[]{note};
                result.add(new Chord(newPitches));
            }
            return  result;
        }
        else {
            Chord subchord = new Chord();
            subchord.pitchs = new Integer[pitchs.length-1];
            System.arraycopy(pitchs,0, subchord.pitchs,0,pitchs.length-1 );
            List<Chord> recursiveVoicings = subchord.constructsVoicing(
                    new ArrayList<>(constraints.subList(0, constraints.size()-1)));
            for (Chord voicing: recursiveVoicings) {
                List<Integer> notesToAdd = Pitch.octavian(pitchs[pitchs.length-1],
                                                              constraints.get(constraints.size()-1));
                result.addAll(voicing.addNotes(notesToAdd));
            }
            return result;
        }
    }

    public Chord pickVoicing(List<PitchConstraint> constraints){

        List<Chord> allVoicing = this.constructsVoicing(constraints);
        Random random = new Random();
        Chord choosenVoicing = allVoicing.get(random.nextInt(allVoicing.size()-1));
        return choosenVoicing;
    }

    //-----------------------------------------------------------------------------------------------------------

    public void prettyPrint(){
        for (int i = 0; i < pitchs.length; i++) {
            System.out.print(Pitch.asString(pitchs[i])+" ");
        }
        System.out.println(" ");
    }

    public String asString(){
        String result = "< ";
        for (int i = 0; i < pitchs.length; i++) {
            result = result+" "+Pitch.asString(pitchs[i]);
        }
        return result+">";
    }



    //--------------------------------------------------------------------------------------------------------

    public Chord(Integer[] notes) {

        pitchs = notes;
    }

    public Chord(){}

    public Chord(String[] notes){

        Integer[] pitchs = new Integer[notes.length];
        for (int i = 0; i < notes.length; i++) {
            pitchs[i] = asInt(notes[i]);
        }
        this.pitchs = pitchs;

    }


    //------------------------------------------------------------------------------------------------------


    public static void main(String[] args) {
         Chord chordTest = new Chord(new Integer[]{40, 43,47});
         List<PitchConstraint>  constraints = new ArrayList<>();
         constraints.add(PitchConstraint.CELLO_RANGE);
         constraints.add(PitchConstraint.ALTO_RANGE);
         constraints.add(PitchConstraint.VIOLIN_RANGE);

         List<Chord> voicingsTest = chordTest.constructsVoicing(constraints);
         for (Chord c:voicingsTest) {
            System.out.println(c.asString());
         }

         System.out.println("Voicings test");
         Chord voicingTest = chordTest.pickVoicing(constraints);
         System.out.println(voicingTest.asString());
    }

}
