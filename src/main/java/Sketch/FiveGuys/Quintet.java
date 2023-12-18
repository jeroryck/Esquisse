package Sketch.FiveGuys;

import Components.DrivenChordSuite;
import Components.Mixing.Blurring;
import Components.Mixing.Fuzzyfier;
import Components.Rythm;
import Components.Sampling.Sampler;
import Components.Voicing.AngularVoicer;
import Components.Voicing.SmoothVoicer;
import Components.Voicing.VoiceLeading;
import Concepts.Chord;
import Concepts.Duration;
import Concepts.PitchConstraint;
import Concepts.Range;
import Sketch.BaseChords;
import Sketch.FiveGuys.PartA.ScoreA;
import Sketch.FiveGuys.PartB.ScoreB;
import Sketch.PhraseA;
import format.MasterOfFiles;
import stairCase.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static Concepts.Duration.*;
import static Concepts.Interval.*;
import static Concepts.PitchConstraint.*;

public class Quintet {
    static BaseChords baseChords;

    static Blurring<Chord> chordBlurring;
    static Blurring<Integer[]> integersTimeSerieBlurring;
    static Blurring<Integer> stepSizeBlurring;

    static VoiceLeading leader;

    static SmoothVoicer smoothVoicer;

    //-----------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        //-------------------------------------------------------------------------------------------------
        //
        //    Harmony Parts

        // 8 periods of 1 minute (8 rehearsal marks A B C D E F G H)
        Chord baseA = new Chord(new String[]{"c'","ees'", "g'","bes'"});
        Integer[] possibleMovesA = new Integer[]{TONE,-TONE,MIN_THIRD,-MIN_THIRD};
        Integer stepSizeA = 3*RONDE;

        Chord baseB = new Chord(new String[]{"c'","ees'","bes'","cis''"});
        Integer[] possibleMovesB = new Integer[]{HALF_TONE,-HALF_TONE,MIN_THIRD,-MIN_THIRD};
        Integer stepSizeB = 7*BLANCHE;

        Chord baseC = new Chord(new String[]{"c'","ees'","bes'","d''"});
        Integer[] possibleMovesC = new Integer[]{MIN_THIRD,-MIN_THIRD,TRITON,-TRITON};
        Integer stepSizeC = 3*RONDE;

        Chord baseD = new Chord(new String[]{"c'","fis'","bes'","e''"});
        Integer[] possibleMovesD = new Integer[]{HALF_TONE,-HALF_TONE,MAJ_THIRD,-MAJ_THIRD};
        Integer stepSizeD = 7*BLANCHE;

        Chord baseE = new Chord(new String[]{"c'","e'", "g'","bes'"});
        Integer[] possibleMovesE = new Integer[]{TONE,-TONE,MIN_THIRD,-MIN_THIRD};
        Integer stepSizeE = 3*RONDE;

        Chord baseF = new Chord(new String[]{"c'","e'","g'","cis''"});
        Integer[] possibleMovesF = new Integer[]{HALF_TONE,-HALF_TONE,TRITON,-TRITON};
        Integer stepSizeF = 5*BLANCHE;

        Chord baseG = new Chord(new String[]{"c'","fis'","aes'","d''"});
        Integer[] possibleMovesG = new Integer[]{TONE,-TONE,MIN_THIRD,-MIN_THIRD};
        Integer stepSizeG = 3*RONDE;

        Chord baseH = new Chord(new String[]{"c'","e'","fis'","d''"});
        Integer[] possibleMovesH = new Integer[]{HALF_TONE,-HALF_TONE,MAJ_THIRD,-MAJ_THIRD};
        Integer stepSizeH = 7*BLANCHE ;

        // Setup of the series
        Harmony seriesOfBaseChordRaw = new Harmony();
        seriesOfBaseChordRaw.heights = new Chord[]{baseA, baseB,baseC,baseD,baseE,baseF,baseG,baseH};
        seriesOfBaseChordRaw.stepRanges = new Integer[9];

        IntegersTimeSerie possibleMovesSeriesRaw = new IntegersTimeSerie();
        possibleMovesSeriesRaw.heights = new Integer[][]
                       {possibleMovesA,possibleMovesB,possibleMovesC,
                        possibleMovesD,possibleMovesE,possibleMovesF,possibleMovesG,possibleMovesH};
        possibleMovesSeriesRaw.stepRanges = new Integer[9];

        StaircaseFunction stepSizeFunctionRaw = new StaircaseFunction();
        stepSizeFunctionRaw.heights = new Integer[]{stepSizeA,stepSizeB,stepSizeC,stepSizeD,
                                                    stepSizeE,stepSizeF,stepSizeG,stepSizeH};
        stepSizeFunctionRaw.stepRanges = new Integer[9];

        // Each chunk lasts one minute
        for (int i = 0; i < 9; i++) {
            seriesOfBaseChordRaw.stepRanges[i]=i*60*Duration.second();
            possibleMovesSeriesRaw.stepRanges[i]=i*60*Duration.second();
            stepSizeFunctionRaw.stepRanges[i]=i*60*Duration.second();
        }

        // These raw series is blurred
        chordBlurring = new Blurring<>(0.15, 0.1);
        Harmony seriesOfBaseChord = (Harmony) chordBlurring.blur(seriesOfBaseChordRaw);
        integersTimeSerieBlurring = new Blurring<>(0.15,0.1);
        IntegersTimeSerie possibleMovesSeries = (IntegersTimeSerie)
                integersTimeSerieBlurring.blur( possibleMovesSeriesRaw);
        stepSizeBlurring = new Blurring<>(0.15,0.1);
        StaircaseFunction stepSizeFunction = (StaircaseFunction) stepSizeBlurring.blur(stepSizeFunctionRaw);

        // 2. Generation of the  chord series, using "DrivenChordSuite" with seriesOfBaseChord as driver
        DrivenChordSuite chordSeries = new DrivenChordSuite();
        chordSeries.baseChordSeries =seriesOfBaseChord;
        chordSeries.possibleMovesSeries = possibleMovesSeries;
        chordSeries.stepSizeSeries = stepSizeFunction;
        chordSeries.setRange(new PitchConstraint("c", "g'"));
        chordSeries.populate(0);

        // 3. Voice leading on the chord series
        leader = new VoiceLeading();
        Harmony chordSeriesVL = leader.voiceLead(chordSeries);

        // 4. Cut in chunks
        Harmony chordSeriesVlA = (Harmony) chordSeriesVL.cut(0,60*Duration.second());
        Harmony chordSeriesVLB = (Harmony) chordSeriesVL.cut(60*Duration.second(), 60*2*Duration.second());
        chordSeriesVLB = (Harmony) chordSeriesVLB.translate(-60*Duration.second()); // to start at 0

        //------------------------------------------------------------------------------------------------------
        //
        //  Part A

        ScoreA scoreA = new ScoreA(chordSeriesVlA);
        scoreA.populate();
        scoreA.save();

        //-------------------------------------------------------------------------------------------------------
        //
        // Part B

        ScoreB scoreB = new ScoreB(chordSeriesVLB);
        scoreB.populate();


        //



    }

}
