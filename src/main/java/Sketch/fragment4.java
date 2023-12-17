package Sketch;

import Components.Voicing.SmoothVoicer;
import Components.Voicing.VoiceLeading;
import Concepts.Chord;
import Concepts.PitchConstraint;
import format.MasterOfFiles;
import stairCase.Harmony;
import stairCase.Phrase;

import java.util.ArrayList;
import java.util.List;

import static Concepts.Duration.*;
import static Concepts.Interval.*;
import static Concepts.Interval.TRITON;

public class fragment4 {
    static BaseChords baseChords;

    static VoiceLeading leader;

    static SmoothVoicer smoothVoicer;

    //-----------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        //-------------------------------------------------------------------------------------------------
        //
        //    Harmony Parts

        // Generation of the baseChord
        int stepNumber = 20;
        int stepSize = 2*RONDE ;
        PitchConstraint range = PitchConstraint.ALTO_RANGE;
        String[] base = new String[]{"c'  ","ees'  ","a ' ","cis'' "};
        Integer[] possibleMove = { TONE, FORTH, FIFTH,-TONE, -FORTH, -FIFTH};

        baseChords = new BaseChords(stepNumber,
                stepSize,
                range,
                base,
                possibleMove);
        baseChords.populate();

        // Voice leading
        List<PitchConstraint> voicingConstraints = new ArrayList<>();
        voicingConstraints.add(PitchConstraint.CELLO_RANGE);
        voicingConstraints.add(PitchConstraint.ALTO_RANGE);
        voicingConstraints.add(PitchConstraint.VIOLIN_RANGE);
        voicingConstraints.add(PitchConstraint.VIOLIN_RANGE);
        leader = new VoiceLeading();
        Harmony voicedHarmPart =leader.voiceLead(baseChords);

        smoothVoicer = new SmoothVoicer(voicingConstraints);
        Chord model = new Chord(new String[]{"g,  ","g  ","c'  ","g' "});
        Harmony smoothHarm = smoothVoicer.addVoicings(voicedHarmPart,model);

        // generation of the string parts, from the voicings previously constructed
        Phrase[] stringParts = smoothHarm.asPhrases();

        //-------------------------------------------------------------------------------------------------------
        //   Format and save
        //

        MasterOfFiles masterSave = new MasterOfFiles();
        masterSave.subDirectoryName = "Fragment4";

        String[] celloLy = stringParts[0].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(celloLy,"cello");

        String[] altoLy = stringParts[1].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(altoLy,"alto");

        String[] violon2Ly = stringParts[2].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon2Ly,"violon2");

        String[] violon1Ly = stringParts[3].lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon1Ly,"violon1");

        String[] rightHandLy = voicedHarmPart.lilyPondVersion(PIANO_STYLE);
        masterSave.save(rightHandLy, "rightHand");


    }

}
