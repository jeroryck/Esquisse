// Generated from C:/Users/eva/Documents/MusicSoftware/Esquisse/src/main/java/Utils/Motifs\cyborgGrammar.g4 by ANTLR 4.12.0
package Utils.Motifs;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cyborgGrammarParser}.
 */
public interface cyborgGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(cyborgGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(cyborgGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#declareVoice}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVoice(cyborgGrammarParser.DeclareVoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#declareVoice}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVoice(cyborgGrammarParser.DeclareVoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(cyborgGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(cyborgGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contextExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterContextExpr(cyborgGrammarParser.ContextExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contextExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitContextExpr(cyborgGrammarParser.ContextExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generatorExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorExpr(cyborgGrammarParser.GeneratorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generatorExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorExpr(cyborgGrammarParser.GeneratorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequenceExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSequenceExpr(cyborgGrammarParser.SequenceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequenceExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSequenceExpr(cyborgGrammarParser.SequenceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parallelExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParallelExpr(cyborgGrammarParser.ParallelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parallelExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParallelExpr(cyborgGrammarParser.ParallelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeatExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepeatExpr(cyborgGrammarParser.RepeatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeatExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepeatExpr(cyborgGrammarParser.RepeatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpr(cyborgGrammarParser.NamedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpr(cyborgGrammarParser.NamedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(cyborgGrammarParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(cyborgGrammarParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#parallel}.
	 * @param ctx the parse tree
	 */
	void enterParallel(cyborgGrammarParser.ParallelContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#parallel}.
	 * @param ctx the parse tree
	 */
	void exitParallel(cyborgGrammarParser.ParallelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitRepeat}
	 * labeled alternative in {@link cyborgGrammarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterExplicitRepeat(cyborgGrammarParser.ExplicitRepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitRepeat}
	 * labeled alternative in {@link cyborgGrammarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitExplicitRepeat(cyborgGrammarParser.ExplicitRepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code choiceRepeat}
	 * labeled alternative in {@link cyborgGrammarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterChoiceRepeat(cyborgGrammarParser.ChoiceRepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code choiceRepeat}
	 * labeled alternative in {@link cyborgGrammarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitChoiceRepeat(cyborgGrammarParser.ChoiceRepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#repeatSpec}.
	 * @param ctx the parse tree
	 */
	void enterRepeatSpec(cyborgGrammarParser.RepeatSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#repeatSpec}.
	 * @param ctx the parse tree
	 */
	void exitRepeatSpec(cyborgGrammarParser.RepeatSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voiceContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 */
	void enterVoiceContext(cyborgGrammarParser.VoiceContextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voiceContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 */
	void exitVoiceContext(cyborgGrammarParser.VoiceContextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code octaveContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 */
	void enterOctaveContext(cyborgGrammarParser.OctaveContextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code octaveContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 */
	void exitOctaveContext(cyborgGrammarParser.OctaveContextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modeContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 */
	void enterModeContext(cyborgGrammarParser.ModeContextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modeContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 */
	void exitModeContext(cyborgGrammarParser.ModeContextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scaleContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 */
	void enterScaleContext(cyborgGrammarParser.ScaleContextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scaleContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 */
	void exitScaleContext(cyborgGrammarParser.ScaleContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#voice}.
	 * @param ctx the parse tree
	 */
	void enterVoice(cyborgGrammarParser.VoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#voice}.
	 * @param ctx the parse tree
	 */
	void exitVoice(cyborgGrammarParser.VoiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code octaveExplicit}
	 * labeled alternative in {@link cyborgGrammarParser#octave}.
	 * @param ctx the parse tree
	 */
	void enterOctaveExplicit(cyborgGrammarParser.OctaveExplicitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code octaveExplicit}
	 * labeled alternative in {@link cyborgGrammarParser#octave}.
	 * @param ctx the parse tree
	 */
	void exitOctaveExplicit(cyborgGrammarParser.OctaveExplicitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code octavePlus}
	 * labeled alternative in {@link cyborgGrammarParser#octave}.
	 * @param ctx the parse tree
	 */
	void enterOctavePlus(cyborgGrammarParser.OctavePlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code octavePlus}
	 * labeled alternative in {@link cyborgGrammarParser#octave}.
	 * @param ctx the parse tree
	 */
	void exitOctavePlus(cyborgGrammarParser.OctavePlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code octaveMinus}
	 * labeled alternative in {@link cyborgGrammarParser#octave}.
	 * @param ctx the parse tree
	 */
	void enterOctaveMinus(cyborgGrammarParser.OctaveMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code octaveMinus}
	 * labeled alternative in {@link cyborgGrammarParser#octave}.
	 * @param ctx the parse tree
	 */
	void exitOctaveMinus(cyborgGrammarParser.OctaveMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#modespec}.
	 * @param ctx the parse tree
	 */
	void enterModespec(cyborgGrammarParser.ModespecContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#modespec}.
	 * @param ctx the parse tree
	 */
	void exitModespec(cyborgGrammarParser.ModespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#scaleSpec}.
	 * @param ctx the parse tree
	 */
	void enterScaleSpec(cyborgGrammarParser.ScaleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#scaleSpec}.
	 * @param ctx the parse tree
	 */
	void exitScaleSpec(cyborgGrammarParser.ScaleSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEventGenerator}
	 * labeled alternative in {@link cyborgGrammarParser#generator}.
	 * @param ctx the parse tree
	 */
	void enterSingleEventGenerator(cyborgGrammarParser.SingleEventGeneratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEventGenerator}
	 * labeled alternative in {@link cyborgGrammarParser#generator}.
	 * @param ctx the parse tree
	 */
	void exitSingleEventGenerator(cyborgGrammarParser.SingleEventGeneratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEventPitchCase}
	 * labeled alternative in {@link cyborgGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void enterSingleEventPitchCase(cyborgGrammarParser.SingleEventPitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEventPitchCase}
	 * labeled alternative in {@link cyborgGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void exitSingleEventPitchCase(cyborgGrammarParser.SingleEventPitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEventDegreCase}
	 * labeled alternative in {@link cyborgGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void enterSingleEventDegreCase(cyborgGrammarParser.SingleEventDegreCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEventDegreCase}
	 * labeled alternative in {@link cyborgGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void exitSingleEventDegreCase(cyborgGrammarParser.SingleEventDegreCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relativeEventDegreCase}
	 * labeled alternative in {@link cyborgGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void enterRelativeEventDegreCase(cyborgGrammarParser.RelativeEventDegreCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relativeEventDegreCase}
	 * labeled alternative in {@link cyborgGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 */
	void exitRelativeEventDegreCase(cyborgGrammarParser.RelativeEventDegreCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#pitch}.
	 * @param ctx the parse tree
	 */
	void enterPitch(cyborgGrammarParser.PitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#pitch}.
	 * @param ctx the parse tree
	 */
	void exitPitch(cyborgGrammarParser.PitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleDurationCase}
	 * labeled alternative in {@link cyborgGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDurationCase(cyborgGrammarParser.SimpleDurationCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDurationCase}
	 * labeled alternative in {@link cyborgGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDurationCase(cyborgGrammarParser.SimpleDurationCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundDurationCase}
	 * labeled alternative in {@link cyborgGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterCompoundDurationCase(cyborgGrammarParser.CompoundDurationCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundDurationCase}
	 * labeled alternative in {@link cyborgGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitCompoundDurationCase(cyborgGrammarParser.CompoundDurationCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#compoundDuration}.
	 * @param ctx the parse tree
	 */
	void enterCompoundDuration(cyborgGrammarParser.CompoundDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#compoundDuration}.
	 * @param ctx the parse tree
	 */
	void exitCompoundDuration(cyborgGrammarParser.CompoundDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#absoluteDegre}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteDegre(cyborgGrammarParser.AbsoluteDegreContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#absoluteDegre}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteDegre(cyborgGrammarParser.AbsoluteDegreContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#relativeDegree}.
	 * @param ctx the parse tree
	 */
	void enterRelativeDegree(cyborgGrammarParser.RelativeDegreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#relativeDegree}.
	 * @param ctx the parse tree
	 */
	void exitRelativeDegree(cyborgGrammarParser.RelativeDegreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dieseCase}
	 * labeled alternative in {@link cyborgGrammarParser#accidental}.
	 * @param ctx the parse tree
	 */
	void enterDieseCase(cyborgGrammarParser.DieseCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dieseCase}
	 * labeled alternative in {@link cyborgGrammarParser#accidental}.
	 * @param ctx the parse tree
	 */
	void exitDieseCase(cyborgGrammarParser.DieseCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bemolCase}
	 * labeled alternative in {@link cyborgGrammarParser#accidental}.
	 * @param ctx the parse tree
	 */
	void enterBemolCase(cyborgGrammarParser.BemolCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bemolCase}
	 * labeled alternative in {@link cyborgGrammarParser#accidental}.
	 * @param ctx the parse tree
	 */
	void exitBemolCase(cyborgGrammarParser.BemolCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#simpleDuration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDuration(cyborgGrammarParser.SimpleDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#simpleDuration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDuration(cyborgGrammarParser.SimpleDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#octaveNumber}.
	 * @param ctx the parse tree
	 */
	void enterOctaveNumber(cyborgGrammarParser.OctaveNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#octaveNumber}.
	 * @param ctx the parse tree
	 */
	void exitOctaveNumber(cyborgGrammarParser.OctaveNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link cyborgGrammarParser#dodecaNumber}.
	 * @param ctx the parse tree
	 */
	void enterDodecaNumber(cyborgGrammarParser.DodecaNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link cyborgGrammarParser#dodecaNumber}.
	 * @param ctx the parse tree
	 */
	void exitDodecaNumber(cyborgGrammarParser.DodecaNumberContext ctx);
}