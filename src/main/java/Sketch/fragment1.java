package Sketch;

import Components.Mixing.Fuzzyfier;
import Components.Voicing.AngularVoicer;
import Concepts.Range;
import Concepts.PitchConstraint;
import format.MasterOfFiles;
import stairCase.Harmony;
import stairCase.Phrase;
import Components.Rythm;

import java.util.ArrayList;
import java.util.List;

import static Concepts.Duration.*;
import static Concepts.Interval.*;
import static Concepts.Interval.TRITON;

public class fragment1 {

    static BaseChords baseChords;

    static AngularVoicer voicer;
    static Harmony voicedForStringsBaseChords;
    static Harmony voicedLeftHandPiano;

    public static void main(String[] args) {

        // Generation of the baseChord
        int stepNumber = 20;
        int stepSize = 2*RONDE ;
        PitchConstraint range = PitchConstraint.ALTO_RANGE;
        String[] base = new String[]{"c '' ","ees '' ","bes '' ","cis ''' "};
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
        voicingConstraints.add(PitchConstraint.VIOLIN_RANGE);
        voicingConstraints.add(PitchConstraint.VIOLIN_RANGE);
        voicer = new AngularVoicer(voicingConstraints);
        voicedForStringsBaseChords = voicer.addVoicings(baseChords);

        // generation of the string parts, from the voicings previously constructed
        Phrase[] stringParts = voicedForStringsBaseChords.asPhrases();
        Fuzzyfier fuzzyfier = new Fuzzyfier(0.5,CROCHE);
        for (int i = 0; i < stringParts.length; i++) {
            fuzzyfier.fuzzyfy(stringParts[i]);
        }

        // generation of the piano left hand
        // as a sampling of BaseChord with an adhoc voicing
        Range leftHandAmbitus = new Range(0, baseChords.getMaxTime());
        Rythm leftHandRythm = new Rythm(BLANCHE,leftHandAmbitus);
        leftHandRythm.populate();
        Harmony leftHandHarmony = (Harmony) baseChords.sample(leftHandRythm.dates);
        List<PitchConstraint> leftHandConstraints = new ArrayList<>();
        PitchConstraint gravePiano = new PitchConstraint("a ,,,","c '");
        leftHandConstraints.add(gravePiano);
        leftHandConstraints.add(gravePiano);
        leftHandConstraints.add(gravePiano);
        leftHandConstraints.add(gravePiano);
        voicer = new AngularVoicer(leftHandConstraints);
        voicedLeftHandPiano = voicer.addVoicings(leftHandHarmony);

        // Lilypond generation and file storage
        MasterOfFiles masterSave = new MasterOfFiles();

        String[] celloLy = stringParts[0].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(celloLy,"cello");

        String[] altoLy = stringParts[1].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(altoLy,"alto");

        String[] violon2Ly = stringParts[2].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon2Ly,"violon2");

        String[] violon1Ly = stringParts[3].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon1Ly,"violon1");

        String[] leftHandLy = voicedLeftHandPiano.lilyPondVersion(PIANO_STYLE);
        masterSave.save(leftHandLy, "leftHand");
    }
}
