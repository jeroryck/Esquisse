package format;

import Concepts.Duration;
import Concepts.HarmonicPitch;
import Concepts.Pitch;
import Utils.Motifs.Motif;
import format.durationGrammar.motifBuilder;
import format.durationGrammar.motifGrammarLexer;
import format.durationGrammar.motifGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

//------------------------------------------------------------------------------------------------------
//
//  A collection of static function to facilitate data input for various data type
//  Specially usefully to describe motif or grace
//

public class FastInput {

    // Construct Harmonic pitch moves from a list of integers
    public static List<HarmonicPitch.Move> hp(int[] codedMove){
        List<HarmonicPitch.Move> result = new ArrayList<>();
        for (int i = 0; i < codedMove.length; i++) {
            result.add(new HarmonicPitch.Move(codedMove[i]));
        }
        return result;
    }

    // Construct Durations from a list of integers (each corresponding to the number of quadruple in the duration)
    public static List<Duration> dur(int[] codedDuration){
        List<Duration> result = new ArrayList<>();
        for (int i = 0; i < codedDuration.length; i++) {
            result.add(new Duration(codedDuration[i]));
        }
        return result;
    }

    // Construct Motifs from a string specification
    public static Motif motifFromString(String s){

        CharStream sourceStream = CharStreams.fromString(s);
        motifGrammarLexer lexer = new motifGrammarLexer(sourceStream);
        // create a parser that feeds from the tokens buffer
        motifGrammarParser parser = new motifGrammarParser(new CommonTokenStream((TokenSource) lexer));

        ParseTree tree = (ParseTree) parser.main(); // begin parsing at patch rule
        System.out.println(tree.toStringTree( (Parser) parser)); // print LISP-style tree

        motifBuilder dmb = new motifBuilder();
        return dmb.asMotif(tree);
    }


//---------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        String testString = "(32  [32 4] 4)";

        Motif<Duration> result = motifFromString(testString);

        result.start();
        for (int i = 0; i < 50; i++) {
            if (!result.hasNext()) break;
            result.next();
            System.out.println(result.currentValue.intValue);
        }

        testString = "(cis.o2 e ais.o-)";
        Motif<Pitch> resultP = motifFromString(testString);

        resultP.start();
        for (int i = 0; i < 50; i++) {
            if (!resultP.hasNext()) break;
            resultP.next();
            System.out.println(resultP.currentValue.index);
        }

        testString = "(LOOP 2 (cis.o2 e ais.o-))";
        resultP = motifFromString(testString);

        resultP.start();
        for (int i = 0; i < 50; i++) {
            if (!resultP.hasNext()) break;
            resultP.next();
            System.out.println(resultP.currentValue.index);
        }

    }
}