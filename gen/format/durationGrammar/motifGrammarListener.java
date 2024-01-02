// Generated from C:/Users/eva/Documents/MusicSoftware/Esquisse/src/main/java/format/durationGrammar/motifGrammar.g4 by ANTLR 4.13.1
package format.durationGrammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link motifGrammarParser}.
 */
public interface motifGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(motifGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(motifGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#linearMotif}.
	 * @param ctx the parse tree
	 */
	void enterLinearMotif(motifGrammarParser.LinearMotifContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#linearMotif}.
	 * @param ctx the parse tree
	 */
	void exitLinearMotif(motifGrammarParser.LinearMotifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEventGenerator}
	 * labeled alternative in {@link motifGrammarParser#generator}.
	 * @param ctx the parse tree
	 */
	void enterSingleEventGenerator(motifGrammarParser.SingleEventGeneratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEventGenerator}
	 * labeled alternative in {@link motifGrammarParser#generator}.
	 * @param ctx the parse tree
	 */
	void exitSingleEventGenerator(motifGrammarParser.SingleEventGeneratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEventPitchCase}
	 * labeled alternative in {@link motifGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void enterSingleEventPitchCase(motifGrammarParser.SingleEventPitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEventPitchCase}
	 * labeled alternative in {@link motifGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void exitSingleEventPitchCase(motifGrammarParser.SingleEventPitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEventDegreCase}
	 * labeled alternative in {@link motifGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void enterSingleEventDegreCase(motifGrammarParser.SingleEventDegreCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEventDegreCase}
	 * labeled alternative in {@link motifGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void exitSingleEventDegreCase(motifGrammarParser.SingleEventDegreCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativeEventDegreCase}
	 * labeled alternative in {@link motifGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void enterRelativeEventDegreCase(motifGrammarParser.RelativeEventDegreCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeEventDegreCase}
	 * labeled alternative in {@link motifGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void exitRelativeEventDegreCase(motifGrammarParser.RelativeEventDegreCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#pitch}.
	 * @param ctx the parse tree
	 */
	void enterPitch(motifGrammarParser.PitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#pitch}.
	 * @param ctx the parse tree
	 */
	void exitPitch(motifGrammarParser.PitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleDurationCase}
	 * labeled alternative in {@link motifGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDurationCase(motifGrammarParser.SimpleDurationCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDurationCase}
	 * labeled alternative in {@link motifGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDurationCase(motifGrammarParser.SimpleDurationCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundDurationCase}
	 * labeled alternative in {@link motifGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterCompoundDurationCase(motifGrammarParser.CompoundDurationCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundDurationCase}
	 * labeled alternative in {@link motifGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitCompoundDurationCase(motifGrammarParser.CompoundDurationCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#compoundDuration}.
	 * @param ctx the parse tree
	 */
	void enterCompoundDuration(motifGrammarParser.CompoundDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#compoundDuration}.
	 * @param ctx the parse tree
	 */
	void exitCompoundDuration(motifGrammarParser.CompoundDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#absoluteDegre}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteDegre(motifGrammarParser.AbsoluteDegreContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#absoluteDegre}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteDegre(motifGrammarParser.AbsoluteDegreContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#relativeDegree}.
	 * @param ctx the parse tree
	 */
	void enterRelativeDegree(motifGrammarParser.RelativeDegreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#relativeDegree}.
	 * @param ctx the parse tree
	 */
	void exitRelativeDegree(motifGrammarParser.RelativeDegreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dieseCase}
	 * labeled alternative in {@link motifGrammarParser#accidental}.
	 * @param ctx the parse tree
	 */
	void enterDieseCase(motifGrammarParser.DieseCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dieseCase}
	 * labeled alternative in {@link motifGrammarParser#accidental}.
	 * @param ctx the parse tree
	 */
	void exitDieseCase(motifGrammarParser.DieseCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bemolCase}
	 * labeled alternative in {@link motifGrammarParser#accidental}.
	 * @param ctx the parse tree
	 */
	void enterBemolCase(motifGrammarParser.BemolCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bemolCase}
	 * labeled alternative in {@link motifGrammarParser#accidental}.
	 * @param ctx the parse tree
	 */
	void exitBemolCase(motifGrammarParser.BemolCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#simpleDuration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDuration(motifGrammarParser.SimpleDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#simpleDuration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDuration(motifGrammarParser.SimpleDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#octaveNumber}.
	 * @param ctx the parse tree
	 */
	void enterOctaveNumber(motifGrammarParser.OctaveNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#octaveNumber}.
	 * @param ctx the parse tree
	 */
	void exitOctaveNumber(motifGrammarParser.OctaveNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#dodecaNumber}.
	 * @param ctx the parse tree
	 */
	void enterDodecaNumber(motifGrammarParser.DodecaNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#dodecaNumber}.
	 * @param ctx the parse tree
	 */
	void exitDodecaNumber(motifGrammarParser.DodecaNumberContext ctx);
}