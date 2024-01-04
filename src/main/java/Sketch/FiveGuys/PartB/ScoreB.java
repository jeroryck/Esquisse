package Sketch.FiveGuys.PartB;

import Concepts.*;
import Utils.Motifs.LinearMotif;
import Utils.Motifs.LoopMotif;
import Utils.Motifs.Motif;
import Utils.Motifs.OrMotif;
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
        pianoRH = new SoundPhrase(underlyingHarmony);



    }


    private void populateStrings() {

        // Violin 1 part
        //--------------

        violin1PitchRange = VIOLIN_RANGE;

        // Set-up of the automatons generating the chord tones
        String specMotifChordTone = "(LOOP 3000 (OR (m1 m1 m-1) (m-1 m-1 m1)))";
        Motif motifChordTonesV1 = FastInput.motifFromString(specMotifChordTone);
        LoopMotif<Duration> motifDurationV1 =
                new LoopMotif<>(FastInput.motifFromString("(2 2 2 1)"),3000);

        // Generation of the sequence of chordTones
        ListRangedHarmonicPitch violinChordTones = new ListRangedHarmonicPitch();
        violinChordTones.addValue(new HarmonicPitch(underlyingHarmony.getValue(0),VIOLIN_RANGE));
        motifChordTonesV1.start();
        motifDurationV1.next();
        violinChordTones.addRange((Duration) motifDurationV1.currentValue);
        while (violinChordTones.length() < underlyingHarmony.getMaxTime()) {
            motifChordTonesV1.next();
            motifDurationV1.next();

            // decoding of the move to obtain a new harmonic pitch
            HarmonicPitch newValue = ((HarmonicPitch.Move) motifChordTonesV1.currentValue).apply(violinChordTones.lastValue());

            // Apply the underlying harmony
            Chord currentHarmonyChord = underlyingHarmony.getValue(violinChordTones.length());
            newValue = newValue.changeChord(currentHarmonyChord);

            violinChordTones.addValue(newValue);
            violinChordTones.addRange((Duration) motifDurationV1.currentValue);
        }

        violin1 = violinChordTones.asSoundPhrase();
        violin1PitchRange.reframe(violin1);

        //-------------------------------------------------------------------------------------------
        // Violin 2 part

        String durV2spec = "(LOOP 3000 (OR (8 mute 8 8 8) (8 mute [4  8])))";
        Motif<Duration> durV2Motif = FastInput.motifFromString(durV2spec);

        String hpV2spec = "()";

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

        String[] rightHandLy = pianoRH.lilyPondVersion(PIANO_STYLE);
        masterSave.save(rightHandLy, "rightHand");
/*
        String[] leftHandLy = pianoLH.lilyPondVersion(PIANO_STYLE);
        masterSave.save(leftHandLy,"leftHand");
*/
    }

    public ScoreB(Harmony underlying) {
        this.underlyingHarmony = underlying;
        this.length = underlying.getMaxTime();
    }
}
