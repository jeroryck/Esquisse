/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Concepts.Interval.OCTAVE;

/**
 *
 * @author jerome
 */


public class Pitch implements Sound {


        // the bounding MIDI numbers, from C-1 to  G9 (C4 = C, just under the first line of treble)
        // the rest is numbered by -1
        private static int MIN_MIDI_NUM = -1;
        private static int MAX_MIDI_NUM = 127;
        public static int REST = -1;

        // numeric value of the pitch (midi num)
        public int index;

        public int IndexMin() { return MIN_MIDI_NUM;}
        public int IndexMax() { return MAX_MIDI_NUM;}


        // default value is middle C (C4)
        private static final int DEFAULT_MIDI_NUM = 60;

        public int DefaultIndex(){ return DEFAULT_MIDI_NUM;}

       //-----------------------------------------------------------------------------------------
       //
       //  Constants for the lilypond notation style

        static final String[] noteNames = {"c", "cis", "d", "ees","e", "f","fis","g","aes","a","bes","b"};
        static final String[] octaveSymbol = {",,,",",,",",","","'","''","'''","''''"};

        static final Map<String, Integer> pitchNameToInteger = new HashMap<>();

        static {   pitchNameToInteger.put("c",0);
            pitchNameToInteger.put("bes",0);
            pitchNameToInteger.put("cis",1);
            pitchNameToInteger.put("des",1);
            pitchNameToInteger.put("d",2);
            pitchNameToInteger.put("dis",3);
            pitchNameToInteger.put("ees",3);
            pitchNameToInteger.put("e",4);
            pitchNameToInteger.put("fes",4);
            pitchNameToInteger.put("f",5);
            pitchNameToInteger.put("eis",5);
            pitchNameToInteger.put("fis",6);
            pitchNameToInteger.put("ges",6);
            pitchNameToInteger.put("g",7);
            pitchNameToInteger.put("gis",8);
            pitchNameToInteger.put("aes",8);
            pitchNameToInteger.put("a",9);
            pitchNameToInteger.put("ais",10);
            pitchNameToInteger.put("bes",10);
            pitchNameToInteger.put("b",11);
            pitchNameToInteger.put("ces",11);
        }

        static final Map<String, Integer> octaveModifierToInteger = new HashMap<>();
        static {
            octaveModifierToInteger.put("o++'",2);
            octaveModifierToInteger.put("o+",1);
            octaveModifierToInteger.put("o-",-1);
            octaveModifierToInteger.put("o--",-2);
        }

        //---------------------------------------------------------------------------------------------------

    @Override
        public Pitch silentValue() {
            return new Pitch(REST);
         }

        @Override
        public Pitch transpose(int decal) {
             return new Pitch(this.index+decal);
        }

    @Override
    public Sound makeLowerThan(int indexPitch) {
        // subtract octaves
        int surplusOctave = (this.index - indexPitch)/12+1;
        return new Pitch(this.index-surplusOctave*Interval.OCTAVE);
    }

    @Override
    public Sound makeGreaterThan(int indexPitch) {
        int missingOctaves = (indexPitch-this.index)/12+1;
        return new Pitch(this.index+missingOctaves*Interval.OCTAVE);
    }

    @Override
    public Boolean lowerThan(int indexPitch) {
        return (this.index <= indexPitch);
    }

    @Override
    public Boolean greaterThan(int indexPitch) {
        return (indexPitch <= this.index);
    }


    public Sound octaviate() {
        return new Chord(new Integer[]{this.transpose(-OCTAVE).index, this.index});
    }

    // Assuming i<j, implement a "jump" of i over j, adding the proper number of octave, such that
        // i> j and i-j<OCTAVE
        public static int nextUpon(int i, int j){
            return i+((j-i)/12 +1)*12;

        }
        // the same, in the other direction
        public static int nextUnder (int i, int j){
           return i-((i-j)/12 -1)*12;
        }

        //------------------------------------------------------------------------------------------
        //
        // From / To string and numeric forms

        // String form from the integer value
        public String asString(){
            return Pitch.asString(index);}



    public static String asString(int intValue){

            // Case of the rest
            if (intValue == -1) return "r";

            // case of a "true" pitch
            int note = intValue % 12;
            String noteAsString;
            noteAsString = noteNames[note];

            String octaveAsString;
            int octave = intValue / 12;
            if ((0<= octave) && (octave<=7)) {
                octaveAsString = octaveSymbol[octave];
            } else octaveAsString = "bad octave number"+octave;

            return ""+noteAsString+" "+octaveAsString;
        }

        // Integer form  from the string value
        public static int asInt(String stringValue) {

            int result;

            // special case of the rest
            if (stringValue=="r"){
                return -1;
            }

            // Split the string into parts using regex
            String noteSpec = stringValue.replaceAll("[',\\s]","");
            String octaveSpec = stringValue.replaceAll("[^',]","");

            // Searching the note int value as the position of the string form in the octaveSymbol array
            int noteNumber=0;
            int index = -1;
            for (int i = 0; i < noteNames.length; i++) {
                if (noteNames[i].equals(noteSpec)) {
                    index = i;
                    break; // Exit the loop once the target is found
                }
            }

            if (index!=-1){
                noteNumber = index;
            } else System.out.println("Bad string form of a pitch "+stringValue);

            // Searching the octave int value as the position of the string form in the octaveSymbol array
            int octaveNumber = 0;
            if (octaveSpec=="") {
                octaveNumber = 3;
            } else {

                index = -1;
                for (int i = 0; i < octaveSymbol.length; i++) {
                    if (octaveSymbol[i].equals(octaveSpec)) {
                        index = i;
                        break; // Exit the loop once the target is found
                    }
                }
                if (index != -1) {
                    octaveNumber = index;
                } else System.out.println("Bad string form of a pitch " + stringValue);
            }
            return  12*octaveNumber+noteNumber;
        }

        //----------------------------------------------------------------------------------------------------
        //
        //   Set of octavian pitchs  respecting a range

        public static List<Integer> octavian(int pitchNumber, PitchConstraint constraint){
            List<Integer> octavianPitch = new ArrayList<>();

            Integer noteNumber = pitchNumber % 12;
            // exploration of the whole octave range
            for (int octave = 0; octave <=7;octave++){
                int candidate = 12*octave+noteNumber;
                if (constraint.contains(candidate)) octavianPitch.add(candidate);
            }

            return octavianPitch;
        }

        //------------------------------------------------------------------------------------------------------
        //
        //  Constructor

        public Pitch() {}

        public Pitch(int i){
            this.index = i;
        }

        // form a string like "a''"
        public Pitch(String s) {this.index = Pitch.asInt(s);}

        // from a string like "ees" and an octave number
    public Pitch(String s, int octave){
        int pitchPos = pitchNameToInteger.get(s);
        this.index = pitchPos+12*octave;
    }

    // With args like cis
    public Pitch(String pitchName, String octaveModifier,int octave){
        int pitchPos = pitchNameToInteger.get(pitchName);
        this.index = pitchPos+(octave+octaveModifierToInteger.get(octaveModifier))*12;
    }
    }
