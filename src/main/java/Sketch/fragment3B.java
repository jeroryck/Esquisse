package Sketch;

import Components.GraceGenerators.Beautifier;
import Components.GraceGenerators.PitchFromPitchGG;
import Components.GraceGenerators.SoundFromPitchGG;
import Components.Mixing.Fuzzyfier;
import Components.Rythm;
import Components.Voicing.AngularVoicer;
import Concepts.*;
import format.MasterOfFiles;
import stairCase.*;

import java.util.ArrayList;
import java.util.List;

import static Concepts.Duration.*;
import static Concepts.Interval.*;

public class fragment3B {


    static BaseChords baseChords;

    static AngularVoicer voicer;
    static Harmony voicedForStringsBaseChords;


    //---------------------------------------------------------------------------------------------------------


    public static void main(String[] args) {

        //-------------------------------------------------------------------------------------------------
        //
        //    String Parts

        // Generation of the baseChord
        int stepNumber = 20;
        int stepSize = 2*RONDE ;
        PitchConstraint range = PitchConstraint.ALTO_RANGE;
        String[] base = new String[]{"c '' ","e '' ","g '' ","c'' "};
        Integer[] possibleMove = {HALF_TONE, TONE, MAJ_THIRD, TRITON, -HALF_TONE,-TONE, -MAJ_THIRD, -TRITON};

        baseChords = new BaseChords(stepNumber,
                stepSize,
                range,
                base,
                possibleMove);
        baseChords.populate();

        // Generation of the voicings of the string harmony
        List<PitchConstraint> voicingConstraints = new ArrayList<>();
        voicingConstraints.add(PitchConstraint.CELLO_RANGE);
        voicingConstraints.add(PitchConstraint.ALTO_RANGE);
        voicingConstraints.add(new PitchConstraint("g", "c''"));
        voicingConstraints.add(new PitchConstraint("g", "c''"));
        voicer = new AngularVoicer(voicingConstraints);
        voicedForStringsBaseChords = voicer.addVoicings(baseChords);

        // generation of the string parts, from the voicings previously constructed
        Phrase[] stringParts = voicedForStringsBaseChords.asPhrases();

        Fuzzyfier fuzzyfier = new Fuzzyfier(0.6,CROCHE);
        for (int i = 0; i < stringParts.length; i++) {
            fuzzyfier.fuzzyfy(stringParts[i]);
        }

        //--------------------------------------------------------------------------------------------------------
        //
        //  Piano Part Right Hand

        // TimeSuite for the beautifier
        Range timeRange = new Range(0, baseChords.getMaxTime());
        Rythm rythm1 = new Rythm(4*Duration.second(),timeRange);
        rythm1.populate();
        Rythm rythm2 = new Rythm(5*Duration.second(),timeRange);
        rythm2.populate();
        TimeSuite sumRythm = rythm1.superpose(rythm2);

        // Grace Generator

        Beautifier<Integer,Pitch> beautifierRH = new Beautifier<Integer, Pitch>() {

            PitchFromPitchGG sgg = new PitchFromPitchGG(new Chord(new String[] {"c","fis","b"}),
                    DOUBLE,3);
            @Override
            public TimeSerie<Pitch> generateGrace(Integer seed) {
                return sgg.generate(seed);
            }
        };
        PitchPhrase pianoPartRH = new PitchPhrase();
        beautifierRH.beautify(stringParts[1 ], sumRythm,pianoPartRH);

        //--------------------------------------------------------------------------------------------------------
        //
        //  Piano Part left Hand

        // TimeSuite for the beautifier
        Range timeRangeLeft = new Range(0, baseChords.getMaxTime());
        Rythm rythmLeft = new Rythm(6*Duration.second(),timeRangeLeft);
        rythmLeft.populate();

        Beautifier<Integer,Sound> beautifierLH = new Beautifier<Integer, Sound>() {
            SoundFromPitchGG sgg =
                    new SoundFromPitchGG(new Chord(new String[] {"c","fis","bes"}),
                          CROCHE,2);
            @Override
            public TimeSerie<Sound> generateGrace(Integer seed) {
                return sgg.generate(seed);
            }
        };
        SoundPhrase pianoPartLH = new SoundPhrase();
        beautifierLH.beautify(stringParts[1 ], rythmLeft,pianoPartLH);


        //-------------------------------------------------------------------------------------------------------
        //   Format and save
        //

        MasterOfFiles masterSave = new MasterOfFiles();
        masterSave.subDirectoryName = "Fragment3B";

        String[] celloLy = stringParts[0].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(celloLy,"cello");

        String[] altoLy = stringParts[1].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(altoLy,"alto");

        String[] violon2Ly = stringParts[2].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon2Ly,"violon2");

        String[] violon1Ly = stringParts[3].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon1Ly,"violon1");

        String[] rightHandLy = pianoPartRH.lilyPondVersion(PIANO_STYLE);
        masterSave.save(rightHandLy, "rightHand");

        String[] leftHandLy = pianoPartLH.lilyPondVersion(PIANO_STYLE);
        masterSave.save(leftHandLy, "leftHand");

    }
}
