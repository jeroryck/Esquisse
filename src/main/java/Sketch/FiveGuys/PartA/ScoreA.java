package Sketch.FiveGuys.PartA;

import Components.GraceGenerators.Beautifier;
import Components.GraceGenerators.SoundFromChordGG;
import Components.Mixing.Fuzzyfier;
import Components.Rythm;
import Components.Sampling.Sampler;
import Components.Voicing.SmoothVoicer;
import Concepts.*;
import format.MasterOfFiles;
import stairCase.Harmony;
import stairCase.Phrase;
import stairCase.SoundPhrase;
import stairCase.TimeSerie;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static Concepts.Duration.*;
import static Concepts.Interval.OCTAVE;
import static Concepts.PitchConstraint.*;
import static Concepts.PitchConstraint.VIOLIN_RANGE;

public class ScoreA {

    int length;

    Harmony underlyingHarmony;

    public SoundPhrase cello;
    public SoundPhrase alto;
    public SoundPhrase violin2;
    public SoundPhrase violin1;
    public SoundPhrase pianoLH;
    public SoundPhrase pianoRH;

    private void populatePiano(){

        // left Hand
        Rythm rythmLHA = new Rythm(RONDE, new Range(0,length));
        rythmLHA.populate();
        Sampler<Sound> sampler = new Sampler<>();
        pianoLH = (SoundPhrase) sampler.sample(cello,rythmLHA);


        // Right Hand
        //-------------------

        // 1. Sampling of the underlying harmony
        Rythm rythmRHA = new Rythm(RONDE,new Range(BLANCHE, length))   ;
        rythmRHA.populate();
        Harmony rightHandA = (Harmony) (new Sampler<Chord>()).sample(underlyingHarmony,rythmRHA);

        // 2. Transposition to various octaves
        for (int i = 0; i < rightHandA.heights.length; i++) {
            int rand = (new Random()).nextInt(3);
            rightHandA.heights[i] = rightHandA.heights[i].transpose(rand*OCTAVE);
        }

        // 3. Generating SoundGrace on a fuzzified series
        (new Fuzzyfier(0.25,CROCHE)).fuzzyfy(rightHandA);

        Beautifier<Chord,Sound> beautifier = new Beautifier<Chord, Sound>() {
            SoundFromChordGG sgg = new SoundFromChordGG(CROCHE,3);
            @Override
            public TimeSerie<Sound> generateGrace(Chord seed) {

                return sgg.generate(seed);
            }
        };

        pianoRH = new SoundPhrase();
        SoundPhrase graces = new SoundPhrase();
        beautifier.beautify(rightHandA,rythmRHA,pianoRH);

    }

    private void populateStrings(){
        PitchConstraint[] arrayVoicingConstraintsA = new PitchConstraint[]{CELLO_RANGE,ALTO_RANGE,VIOLIN_RANGE,VIOLIN_RANGE};
        List<PitchConstraint> voicingConstraintsA = Arrays.asList(arrayVoicingConstraintsA);
        SmoothVoicer smoothVoicer = new SmoothVoicer(voicingConstraintsA);
        Chord model = new Chord(new String[]{"g,  ","g  ","c'  ","g' "});
        Harmony smoothHarmA = smoothVoicer.addVoicings(underlyingHarmony,model);

        // b. Split into parts
        Phrase[] stringParts = smoothHarmA.asPhrases();
        cello = new SoundPhrase(stringParts[0]);
        alto = new SoundPhrase(stringParts[1]);
        violin2 = new SoundPhrase(stringParts[2]);
        violin1 = new SoundPhrase(stringParts[3]);

    }

    public void populate(){

        populateStrings();
        populatePiano();
        save();
    }

    public void save(){
        MasterOfFiles masterSave = new MasterOfFiles();
        masterSave.subDirectoryName = "FiveGuysA";

        String[] celloLy = cello.lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(celloLy,"cello");

        String[] altoLy = alto.lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(altoLy,"alto");

        String[] violon2Ly = violin2.lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon2Ly,"violon2");

        String[] violon1Ly = violin1.lilyPondVersion(STRING_CUBASE_STYLE);
        masterSave.save(violon1Ly,"violon1");

        String[] rightHandLy = pianoRH.lilyPondVersion(PIANO_STYLE);
        masterSave.save(rightHandLy, "rightHand");

        String[] leftHandLy = pianoLH.lilyPondVersion(PIANO_STYLE);
        masterSave.save(leftHandLy,"leftHand");
    }



    public ScoreA(Harmony underlying) {
        this.underlyingHarmony = underlying;
        this.length = underlying.getMaxTime();
    }
}
