// Generated from C:/Users/eva/Documents/MusicSoftware/Esquisse/src/main/java/format/durationGrammar/motifGrammar.g4 by ANTLR 4.13.1
package format.durationGrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link motifGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface motifGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(motifGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#linearMotif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinearMotif(motifGrammarParser.LinearMotifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEventGenerator}
	 * labeled alternative in {@link motifGrammarParser#generator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEventGenerator(motifGrammarParser.SingleEventGeneratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEventPitchCase}
	 * labeled alternative in {@link motifGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEventPitchCase(motifGrammarParser.SingleEventPitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEventDegreCase}
	 * labeled alternative in {@link motifGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEventDegreCase(motifGrammarParser.SingleEventDegreCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relativeEventDegreCase}
	 * labeled alternative in {@link motifGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeEventDegreCase(motifGrammarParser.RelativeEventDegreCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#pitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPitch(motifGrammarParser.PitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleDurationCase}
	 * labeled alternative in {@link motifGrammarParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDurationCase(motifGrammarParser.SimpleDurationCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundDurationCase}
	 * labeled alternative in {@link motifGrammarParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundDurationCase(motifGrammarParser.CompoundDurationCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#compoundDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundDuration(motifGrammarParser.CompoundDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#absoluteDegre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteDegre(motifGrammarParser.AbsoluteDegreContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#relativeDegree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeDegree(motifGrammarParser.RelativeDegreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dieseCase}
	 * labeled alternative in {@link motifGrammarParser#accidental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDieseCase(motifGrammarParser.DieseCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bemolCase}
	 * labeled alternative in {@link motifGrammarParser#accidental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBemolCase(motifGrammarParser.BemolCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#simpleDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDuration(motifGrammarParser.SimpleDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#octaveNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveNumber(motifGrammarParser.OctaveNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#dodecaNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDodecaNumber(motifGrammarParser.DodecaNumberContext ctx);
}