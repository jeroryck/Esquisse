// Generated from C:/Users/eva/Documents/MusicSoftware/Esquisse/src/main/java/format/durationGrammar/durationMotifG.g4 by ANTLR 4.13.1
package format.durationGrammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link durationMotifGParser}.
 */
public interface durationMotifGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link durationMotifGParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(durationMotifGParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link durationMotifGParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(durationMotifGParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link durationMotifGParser#linearMotif}.
	 * @param ctx the parse tree
	 */
	void enterLinearMotif(durationMotifGParser.LinearMotifContext ctx);
	/**
	 * Exit a parse tree produced by {@link durationMotifGParser#linearMotif}.
	 * @param ctx the parse tree
	 */
	void exitLinearMotif(durationMotifGParser.LinearMotifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEventGenerator}
	 * labeled alternative in {@link durationMotifGParser#generator}.
	 * @param ctx the parse tree
	 */
	void enterSingleEventGenerator(durationMotifGParser.SingleEventGeneratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEventGenerator}
	 * labeled alternative in {@link durationMotifGParser#generator}.
	 * @param ctx the parse tree
	 */
	void exitSingleEventGenerator(durationMotifGParser.SingleEventGeneratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEventPitchCase}
	 * labeled alternative in {@link durationMotifGParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void enterSingleEventPitchCase(durationMotifGParser.SingleEventPitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEventPitchCase}
	 * labeled alternative in {@link durationMotifGParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void exitSingleEventPitchCase(durationMotifGParser.SingleEventPitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEventDegreCase}
	 * labeled alternative in {@link durationMotifGParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void enterSingleEventDegreCase(durationMotifGParser.SingleEventDegreCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEventDegreCase}
	 * labeled alternative in {@link durationMotifGParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void exitSingleEventDegreCase(durationMotifGParser.SingleEventDegreCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativeEventDegreCase}
	 * labeled alternative in {@link durationMotifGParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void enterRelativeEventDegreCase(durationMotifGParser.RelativeEventDegreCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeEventDegreCase}
	 * labeled alternative in {@link durationMotifGParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void exitRelativeEventDegreCase(durationMotifGParser.RelativeEventDegreCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link durationMotifGParser#pitch}.
	 * @param ctx the parse tree
	 */
	void enterPitch(durationMotifGParser.PitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link durationMotifGParser#pitch}.
	 * @param ctx the parse tree
	 */
	void exitPitch(durationMotifGParser.PitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleDurationCase}
	 * labeled alternative in {@link durationMotifGParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDurationCase(durationMotifGParser.SimpleDurationCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDurationCase}
	 * labeled alternative in {@link durationMotifGParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDurationCase(durationMotifGParser.SimpleDurationCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundDurationCase}
	 * labeled alternative in {@link durationMotifGParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterCompoundDurationCase(durationMotifGParser.CompoundDurationCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundDurationCase}
	 * labeled alternative in {@link durationMotifGParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitCompoundDurationCase(durationMotifGParser.CompoundDurationCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link durationMotifGParser#compoundDuration}.
	 * @param ctx the parse tree
	 */
	void enterCompoundDuration(durationMotifGParser.CompoundDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link durationMotifGParser#compoundDuration}.
	 * @param ctx the parse tree
	 */
	void exitCompoundDuration(durationMotifGParser.CompoundDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link durationMotifGParser#absoluteDegre}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteDegre(durationMotifGParser.AbsoluteDegreContext ctx);
	/**
	 * Exit a parse tree produced by {@link durationMotifGParser#absoluteDegre}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteDegre(durationMotifGParser.AbsoluteDegreContext ctx);
	/**
	 * Enter a parse tree produced by {@link durationMotifGParser#relativeDegree}.
	 * @param ctx the parse tree
	 */
	void enterRelativeDegree(durationMotifGParser.RelativeDegreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link durationMotifGParser#relativeDegree}.
	 * @param ctx the parse tree
	 */
	void exitRelativeDegree(durationMotifGParser.RelativeDegreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dieseCase}
	 * labeled alternative in {@link durationMotifGParser#accidental}.
	 * @param ctx the parse tree
	 */
	void enterDieseCase(durationMotifGParser.DieseCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dieseCase}
	 * labeled alternative in {@link durationMotifGParser#accidental}.
	 * @param ctx the parse tree
	 */
	void exitDieseCase(durationMotifGParser.DieseCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bemolCase}
	 * labeled alternative in {@link durationMotifGParser#accidental}.
	 * @param ctx the parse tree
	 */
	void enterBemolCase(durationMotifGParser.BemolCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bemolCase}
	 * labeled alternative in {@link durationMotifGParser#accidental}.
	 * @param ctx the parse tree
	 */
	void exitBemolCase(durationMotifGParser.BemolCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link durationMotifGParser#simpleDuration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDuration(durationMotifGParser.SimpleDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link durationMotifGParser#simpleDuration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDuration(durationMotifGParser.SimpleDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link durationMotifGParser#octaveNumber}.
	 * @param ctx the parse tree
	 */
	void enterOctaveNumber(durationMotifGParser.OctaveNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link durationMotifGParser#octaveNumber}.
	 * @param ctx the parse tree
	 */
	void exitOctaveNumber(durationMotifGParser.OctaveNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link durationMotifGParser#dodecaNumber}.
	 * @param ctx the parse tree
	 */
	void enterDodecaNumber(durationMotifGParser.DodecaNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link durationMotifGParser#dodecaNumber}.
	 * @param ctx the parse tree
	 */
	void exitDodecaNumber(durationMotifGParser.DodecaNumberContext ctx);
}