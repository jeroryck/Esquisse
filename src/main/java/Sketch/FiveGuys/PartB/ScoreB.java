package Sketch.FiveGuys.PartB;

import Concepts.*;
import Utils.Motifs.LinearMotif;
import Utils.Motifs.LoopMotif;
import format.FastInput;
import format.MasterOfFiles;
import stairCase.Harmony;
import stairCase.SoundPhrase;

import java.util.List;

import static Concepts.Duration.*;
import static Concepts.PitchConstraint.*;

public class ScoreB {

    int length;

    Harmony underlyingHarmony;

    public SoundPhrase cello;
    public SoundPhrase alto;
    public SoundPhrase violin2;
    public SoundPhrase violin1;
    public PitchConstraint violin1PitchRange;
    public SoundPhrase pianoLH;
    public SoundPhrase pianoRH;

    private void populatePiano(){

        // left Hand


        // Right Hand
        //-------------------




    }


    private void populateStrings() {

        // Violin 1 part
        //--------------

        violin1PitchRange = VIOLIN_RANGE;

        // Set-up of the automaton generating the chord tones
        List<HarmonicPitch.Move> baseMotifChordTonesV1 = FastInput.hp(new int[]{1,1,-1});
        List<Duration> baseMotifDurationV1 = FastInput.dur(new int[]{NOIRE,NOIRE,NOIRE,BLANCHE});
        LoopMotif<HarmonicPitch.Move> motifChordTonesV1 =
                new LoopMotif<>(new LinearMotif<>(baseMotifChordTonesV1),3000); // arbitrary high (unused)
        LoopMotif<Duration> motifDurationV1 =
                new LoopMotif<Duration>(new LinearMotif<Duration>(baseMotifDurationV1),3000);

        // Generation of the sequence of chordTones
        ListRangedHarmonicPitch violinChordTones = new ListRangedHarmonicPitch();
        violinChordTones.addValue(new HarmonicPitch(underlyingHarmony.getValue(0),VIOLIN_RANGE));
        motifDurationV1.next();
        violinChordTones.addRange((Duration) motifDurationV1.currentValue);
        while (violinChordTones.length() < underlyingHarmony.getMaxTime()) {
            motifChordTonesV1.next();
            motifDurationV1.next();
            // decoding of the move to obtain a new harmonic pitch
            HarmonicPitch newValue = ((HarmonicPitch.Move) motifChordTonesV1.currentValue).apply(violinChordTones.lastValue());
            violinChordTones.addValue(newValue);
            violinChordTones.addRange((Duration) motifDurationV1.currentValue);
        }

        for (int i = 0; i < violinChordTones.size(); i++) {
            System.out.println(violinChordTones.valueList.get(i).asString()+" "+
                    violinChordTones.rangeList.get(i).intValue);
        }

        violin1 = violinChordTones.asSoundPhrase();
    }

    public void populate(){

        populateStrings();
        populatePiano();
        save();
    }

    public void save(){
        MasterOfFiles masterSave = new MasterOfFiles();
        masterSave.subDirectoryName = "FiveGuysB";

/*        String[] celloLy = cello.lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(celloLy,"cello");

        String[] altoLy = alto.lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(altoLy,"alto");

        String[] violon2Ly = violin2.lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon2Ly,"violon2");
*/
        String[] violon1Ly = violin1.lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon1Ly,"violon1");
/*
        String[] rightHandLy = pianoRH.lilyPondVersion(PIANO_STYLE);
        masterSave.save(rightHandLy, "rightHand");

        String[] leftHandLy = pianoLH.lilyPondVersion(PIANO_STYLE);
        masterSave.save(leftHandLy,"leftHand");
*/
    }

    public ScoreB(Harmony underlying) {
        this.underlyingHarmony = underlying;
        this.length = underlying.getMaxTime();
    }
}
