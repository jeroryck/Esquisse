package format.durationGrammar;

import Concepts.Duration;
import Utils.Motifs.LinearMotif;
import Utils.Motifs.Motif;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class DurationMotifBuilder extends durationMotifGBaseVisitor {

    //-------------------------------------------------------------------------------------------------------------
    // Visit start
    public Motif<Duration> asMotif(ParseTree tree){
        return (Motif<Duration>) this.visit(tree);
    };

    public Motif<Duration> visitMain(durationMotifGParser.MainContext ctx) {
        System.out.println("visiting main");

        durationMotifGParser.LinearMotifContext lmc = ctx.linearMotif();

        // Reading of the durations of the linear motif
        List<Duration> lDur = new ArrayList<>();
        for (int i = 0; i < lmc.duration().size(); i++) {
            lDur.add(new Duration(lmc.duration(i).getText()));
        }

        LinearMotif<Duration> linearMotif = new LinearMotif<>(lDur);

        return linearMotif;
    }
}
