package format;

import Concepts.Duration;
import Concepts.HarmonicPitch;
import Utils.Motifs.Motif;
import format.durationGrammar.DurationMotifBuilder;
import format.durationGrammar.durationMotifGLexer;
import format.durationGrammar.durationMotifGParser;
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
    public static Motif<Duration> durationMotifFromString(String s){

        CharStream sourceStream = CharStreams.fromString(s);
        durationMotifGLexer lexer = new durationMotifGLexer(sourceStream);
        // create a parser that feeds from the tokens buffer
        durationMotifGParser parser = new durationMotifGParser(new CommonTokenStream((TokenSource) lexer));

        ParseTree tree = (ParseTree) parser.main(); // begin parsing at patch rule
        System.out.println(tree.toStringTree( (Parser) parser)); // print LISP-style tree

        DurationMotifBuilder dmb = new DurationMotifBuilder();
        return dmb.asMotif(tree);
    }


//---------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        String testString = "(32 8 4)";

        Motif<Duration> result = durationMotifFromString(testString);

    }
}