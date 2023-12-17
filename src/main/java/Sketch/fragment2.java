package Sketch;

import Components.DrivenChordSuite;
import Components.ExtentTimeSuite;
import Components.Mixing.Fuzzyfier;
import Components.Voicing.AngularVoicer;
import Concepts.Chord;
import Concepts.PitchConstraint;
import Concepts.Range;
import format.MasterOfFiles;
import stairCase.Harmony;
import stairCase.Phrase;
import stairCase.StaircaseFunction;

import java.util.ArrayList;
import java.util.List;

import static Concepts.Duration.*;
import static Concepts.Interval.*;
import static Concepts.Interval.TRITON;
import static Concepts.PitchConstraint.ALTO_RANGE;

public class fragment2 {

    // The generated series of  Chords
    static DrivenChordSuite chordSuite;

    //this series is driven by a series giving the base chord
    static Harmony baseChordDriver;

    // and another series giving the step length
    static StaircaseFunction timeSequenceStepSize;

    public static void main(String[] args) {

        //------------------------------------------------------------------------------------------------------------
        // We set up base chord driver
        baseChordDriver = new Harmony();

        // The step range series is "extend time chord"
        int totalDuration = 50*RONDE;
        int firstValueTimeChord = 4*RONDE;
        int[] evolutionsTimeChord = {CROCHE, CROCHE+DOUBLE,-NOIRE,-CROCHE};
        Range range = new Range(2*RONDE, 6*RONDE);

        ExtentTimeSuite extentTimeChord = new ExtentTimeSuite(evolutionsTimeChord,
                                                              totalDuration,
                                                              firstValueTimeChord,
                                                              range);
        extentTimeChord.populate();
        baseChordDriver.stepRanges=extentTimeChord.dates;

        for (int i = 0; i < extentTimeChord.dates.length; i++) {
            System.out.println(extentTimeChord.dates[i]);
        }

        // the heights are enumerated from "base chord repository"
        Chord[] baseChordRepository = {new Chord(new String[]{"e", "aes", "d '", "fis '"}),
                                                  new Chord(new String[]{"e","g","cis '","ees '"}),
                                                  new Chord(new String[]{"e","aes","d '","f '"})};
        baseChordDriver.heights = new Chord[extentTimeChord.dates.length-1];
        for (int i = 0; i < extentTimeChord.dates.length-1; i++) {
            baseChordDriver.heights[i] = baseChordRepository[i%3];
        }

        //-------------------------------------------------------------------------------------------------------
        //
        //  Now we construct the step size driver series

        timeSequenceStepSize = new StaircaseFunction();

        int firstValueTimeStep = 2*RONDE;
        int [] evolutionsTimeStep = {CROCHE, -CROCHE-DOUBLE, -CROCHE};
        Range stepRange = new Range(NOIRE, BLANCHE);

        // the step range are constructed as "extent time step"
        ExtentTimeSuite extentTimeStep = new ExtentTimeSuite(evolutionsTimeStep,
                                                             totalDuration,
                                                             firstValueTimeStep,
                                                             stepRange);
        extentTimeStep.populate();
        timeSequenceStepSize.stepRanges = extentTimeStep.dates;

        // the heights are enumerated from "step size repository"
        int [] stepSizeRepository = {BLANCHE, BLANCHE-DOUBLE,BLANCHE-CROCHE, NOIRE+DOUBLE, NOIRE};
        timeSequenceStepSize.heights = new Integer[extentTimeStep.dates.length-1];
        for (int i = 0; i < timeSequenceStepSize.heights.length; i++) {
            timeSequenceStepSize.heights[i] = stepSizeRepository[i%5];
        }

        //----------------------------------------------------------------------------------------------
        //
        // We can set up the base chord series, using the two drivers previously setup.

        chordSuite = new DrivenChordSuite(baseChordDriver,timeSequenceStepSize);
        //chordSuite.setPossibleMoves(new Integer[]{HALF_TONE, TONE, MAJ_THIRD, TRITON, -HALF_TONE, -TONE, -MAJ_THIRD, -TRITON});
        chordSuite.setRange(ALTO_RANGE);
        chordSuite.populate(0);



        //--------------------------------------------------------------------------------------------
        //
        //  We derive a string quartet piece of music, with voicing and fuzzyfication
        // Generation of the voicings of the string harmony
        List<PitchConstraint> voicingConstraints = new ArrayList<>();
        voicingConstraints.add(PitchConstraint.CELLO_RANGE);
        voicingConstraints.add(PitchConstraint.ALTO_RANGE);
        voicingConstraints.add(PitchConstraint.VIOLIN_RANGE);
        voicingConstraints.add(PitchConstraint.VIOLIN_RANGE);
        AngularVoicer voicer = new AngularVoicer(voicingConstraints);
        Harmony voicedForStringsBaseChords = voicer.addVoicings(chordSuite);

        // generation of the string parts, from the voicings previously constructed
        Phrase[] stringParts = voicedForStringsBaseChords.asPhrases();
        Fuzzyfier fuzzyfier = new Fuzzyfier(0.5,CROCHE);
        for (int i = 0; i < stringParts.length; i++) {
            fuzzyfier.fuzzyfy(stringParts[i]);
        }

        //--------------------------------------------------------------------------------------------------------
        //
        // Lilypond generation and file storage


        MasterOfFiles masterSave = new MasterOfFiles();
        masterSave.subDirectoryName = "Fragment2";

        String[] celloLy = stringParts[0].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(celloLy,"cello");

        String[] altoLy = stringParts[1].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(altoLy,"alto");

        String[] violon2Ly = stringParts[2].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon2Ly,"violon2");

        String[] violon1Ly = stringParts[3].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon1Ly,"violon1");
    }
}
