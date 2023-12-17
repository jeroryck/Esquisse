package Sketch;

import Components.*;
import Components.GraceGenerators.Beautifier;
import Components.Voicing.AngularVoicer;
import Concepts.*;
import format.MasterOfFiles;
import stairCase.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Concepts.Duration.*;
import static Concepts.Interval.*;

public class fragment3A {

    static PitchPhrase pianoGrace1 = PitchPhrase.fastInput(new String[] {
            "f", "8",
            "b", "8",
            "e'", "8",
            "a'", "8",
            "cis''", "8",
            "g''", "8",
            "e''", "16",
            "g''","8",
            "aes'","16" });

    static PitchPhrase pianoGrace2 = PitchPhrase.fastInput(new String[] {
            "f", "8",
            "a", "8",
            "cis'", "8",
            "g'", "8",
            "b'", "8",
            "ees''", "8",
            "aes''", "8",
            "f''", "16",
            "ees''", "8",
            "g'", "16"
    });

    static PitchPhrase pianoGrace3 = PitchPhrase.fastInput(new String[] {
            "aes'", "8",
            "bes'", "8",
            "d''", "8",
            "fis''", "8",
            "g''", "8",
            "fis'''", "16",
            "d'''", "8",
            "aes'''", "16"
    });

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
        String[] base = new String[]{"c '' ","ees '' ","g '' ","bes'' "};
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

        //--------------------------------------------------------------------------------------------------------
        //
        //  Piano Part

        // TimeSuite for the beautifier
        Range timeRange = new Range(0, baseChords.getMaxTime());
        Rythm rythm1 = new Rythm(4*Duration.second(),timeRange);
        rythm1.populate();
        Rythm rythm2 = new Rythm(5*Duration.second(),timeRange);
        rythm2.populate();
        TimeSuite sumRythm = rythm1.superpose(rythm2);

        // Grace Generator
        Beautifier<Integer,Pitch> beautifier = new Beautifier<Integer, Pitch>() {
            PitchPhrase[] graces = new PitchPhrase[]{pianoGrace1,pianoGrace2,pianoGrace3};
            @Override
            public TimeSerie<Pitch> generateGrace(Integer seed) {
                Random random = new Random();
                PitchPhrase grace = graces[random.nextInt(graces.length)];
                PitchPhrase transposedGrace = grace.transpose(seed-grace.heights[0].index);
                return  transposedGrace;
            }
        };
        PitchPhrase pianoPart = new PitchPhrase();
        beautifier.beautify(stringParts[1 ], sumRythm, pianoPart);


        //-------------------------------------------------------------------------------------------------------
        //   Format and save
        //

        MasterOfFiles masterSave = new MasterOfFiles();
        masterSave.subDirectoryName = "Fragment3A";

        String[] celloLy = stringParts[0].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(celloLy,"cello");

        String[] altoLy = stringParts[1].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(altoLy,"alto");

        String[] violon2Ly = stringParts[2].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon2Ly,"violon2");

        String[] violon1Ly = stringParts[3].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon1Ly,"violon1");

        String[] leftHandLy = pianoPart.lilyPondVersion(PIANO_STYLE);
        masterSave.save(leftHandLy, "leftHand");

    }
}
