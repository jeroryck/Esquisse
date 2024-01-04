package format.durationGrammar;

import Concepts.Duration;
import Concepts.HarmonicPitch;
import Concepts.Pitch;
import Utils.Motifs.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class motifBuilder extends motifGrammarBaseVisitor {


    //-------------------------------------------------------------------------------------------------------------
    // Visit start
    public Motif asMotif(ParseTree tree){
        return (Motif) this.visit(tree);
    };

    public Motif visitMain(motifGrammarParser.MainContext ctx) {
        System.out.println("visiting main");

        return  (Motif) visit(ctx.motif());
    }


    //---------------------------------------------------------------------------------------------------------------
    //
    // Durations


    @Override
    public Duration visitDurationSpec(motifGrammarParser.DurationSpecContext ctx) {
        Duration duration = (Duration) visit(ctx.duration());
        if (!(ctx.mute()==null)) duration.mute = true;
        return duration;
    }

    @Override
    public Motif<Duration> visitLinearMotifDuration(motifGrammarParser.LinearMotifDurationContext lmc) {

        // Reading of the durations of the linear motif
        List<Duration> lDur = new ArrayList<>();
        for (int i = 0; i < lmc.durationSpec().size(); i++) {
            // Visiting according to the proper case of the rule defining duration
            Duration duration = (Duration) visit(lmc.durationSpec(i));
            lDur.add(i,duration);
        }

        LinearMotif<Duration> linearMotif = new LinearMotif<>(lDur);

        return linearMotif;
    }
    public Duration visitSimpleDuration(motifGrammarParser.SimpleDurationContext sdc){
        return new Duration(sdc.getText());
    }

    @Override
    public Object visitCompoundDuration(motifGrammarParser.CompoundDurationContext ctx) {
        // We add all the simple durations of the list defining the compound duration

        Duration result = new Duration(ctx.simpleDuration(0).getText());
        for (int i = 1; i < ctx.simpleDuration().size(); i++) {
            result.add(new Duration((ctx.simpleDuration(i).getText())));
        }

        return result;
    }

    //--------------------------------------------------------------------------------------------------------------
    //
    // Pitchs

    @Override
    public Motif<Pitch> visitLinearMotifPitch(motifGrammarParser.LinearMotifPitchContext ctx) {

        List<Pitch> lPitch = new ArrayList<>();
        for (int i = 0; i < ctx.pitch().size(); i++) {
            lPitch.add(i, (Pitch) visitPitch(ctx.pitch(i)));
        }

        LinearMotif<Pitch> linearMotif = new LinearMotif<>(lPitch);
        return linearMotif;
    }

    // used for the simple pitch (no octave specification). This value could be set by previous pitch specification
    // with octave specification or modirier.
    private int currentOctave= 3;

    @Override
    public Pitch visitAbsolutePitch(motifGrammarParser.AbsolutePitchContext ctx) {
        String pitchName = ctx.pitchName().getText();
        Integer octaveNumber = Integer.valueOf(ctx.octaveNumber().getText().substring(1));
        currentOctave = octaveNumber;
        return new Pitch(pitchName,octaveNumber);
    }

    @Override
    public Object visitRelativePitch(motifGrammarParser.RelativePitchContext ctx) {
        String pitchName = ctx.pitchName().getText();
        String octaveModifier = ctx.octaveModifier().getText();
        return new Pitch(pitchName,octaveModifier,currentOctave);
    }

    @Override
    public Object visitSimplePitch(motifGrammarParser.SimplePitchContext ctx) {
        String pitchName = ctx.pitchName().getText();
        return new Pitch(pitchName,currentOctave);
    }

    // Pitch move
    //-------------------------------------------------------------------------------------------------------------


    @Override
    public Motif<HarmonicPitch.Move> visitLinearMotifPitchMove(motifGrammarParser.LinearMotifPitchMoveContext ctx) {

        List<HarmonicPitch.Move> pitchMoves = new ArrayList<>();
        for (int i = 0; i < ctx.pitchMove().size(); i++) {
            int intMove = Integer.valueOf(ctx.pitchMove(i).pitchMoveNumber().getText());
            pitchMoves.add(i,new HarmonicPitch.Move(intMove));
        }

        return new LinearMotif<HarmonicPitch.Move>(pitchMoves);
    }

    // Compound motifs
    //----------------------------------------------------------------------------------------------------------------


    @Override
    public SeriesMotif visitSeriesMotif(motifGrammarParser.SeriesMotifContext ctx) {

        List<Motif>motifs = new ArrayList<>();
        for (int i = 0; i < ctx.motif().size(); i++) {
            motifs.add(i,(Motif) visit(ctx.motif(i)));
        }

        return new SeriesMotif(motifs);
    }

    @Override
    public OrMotif visitOrMotif(motifGrammarParser.OrMotifContext ctx) {

        List<Motif>motifs = new ArrayList<>();
        for (int i = 0; i < ctx.motif().size(); i++) {
            motifs.add(i,(Motif) visit(ctx.motif(i)));
        }

        return new OrMotif<>(motifs.toArray(new Motif[motifs.size()]));
    }

    @Override
    public LoopMotif visitLoopMotif(motifGrammarParser.LoopMotifContext ctx) {

        String loops = ctx.loopNumber().getText();
        Motif motif = (Motif) visit(ctx.motif());

        return new LoopMotif<>(motif,Integer.valueOf(loops) );
    }
}
