// Generated from C:/Users/eva/Documents/MusicSoftware/Esquisse/src/main/java/Utils/Motifs\cyborgGrammar.g4 by ANTLR 4.12.0
package Utils.Motifs;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cyborgGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cyborgGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(cyborgGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#declareVoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVoice(cyborgGrammarParser.DeclareVoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(cyborgGrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contextExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextExpr(cyborgGrammarParser.ContextExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generatorExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratorExpr(cyborgGrammarParser.GeneratorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequenceExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceExpr(cyborgGrammarParser.SequenceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parallelExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelExpr(cyborgGrammarParser.ParallelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatExpr(cyborgGrammarParser.RepeatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedExpr}
	 * labeled alternative in {@link cyborgGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpr(cyborgGrammarParser.NamedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(cyborgGrammarParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#parallel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel(cyborgGrammarParser.ParallelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explicitRepeat}
	 * labeled alternative in {@link cyborgGrammarParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitRepeat(cyborgGrammarParser.ExplicitRepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code choiceRepeat}
	 * labeled alternative in {@link cyborgGrammarParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceRepeat(cyborgGrammarParser.ChoiceRepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#repeatSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatSpec(cyborgGrammarParser.RepeatSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voiceContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoiceContext(cyborgGrammarParser.VoiceContextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code octaveContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveContext(cyborgGrammarParser.OctaveContextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modeContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeContext(cyborgGrammarParser.ModeContextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scaleContext}
	 * labeled alternative in {@link cyborgGrammarParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleContext(cyborgGrammarParser.ScaleContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#voice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoice(cyborgGrammarParser.VoiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code octaveExplicit}
	 * labeled alternative in {@link cyborgGrammarParser#octave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveExplicit(cyborgGrammarParser.OctaveExplicitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code octavePlus}
	 * labeled alternative in {@link cyborgGrammarParser#octave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctavePlus(cyborgGrammarParser.OctavePlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code octaveMinus}
	 * labeled alternative in {@link cyborgGrammarParser#octave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveMinus(cyborgGrammarParser.OctaveMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#modespec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModespec(cyborgGrammarParser.ModespecContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#scaleSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleSpec(cyborgGrammarParser.ScaleSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEventGenerator}
	 * labeled alternative in {@link cyborgGrammarParser#generator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEventGenerator(cyborgGrammarParser.SingleEventGeneratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEventPitchCase}
	 * labeled alternative in {@link cyborgGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEventPitchCase(cyborgGrammarParser.SingleEventPitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEventDegreCase}
	 * labeled alternative in {@link cyborgGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEventDegreCase(cyborgGrammarParser.SingleEventDegreCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relativeEventDegreCase}
	 * labeled alternative in {@link cyborgGrammarParser#singleEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeEventDegreCase(cyborgGrammarParser.RelativeEventDegreCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#pitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPitch(cyborgGrammarParser.PitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleDurationCase}
	 * labeled alternative in {@link cyborgGrammarParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDurationCase(cyborgGrammarParser.SimpleDurationCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundDurationCase}
	 * labeled alternative in {@link cyborgGrammarParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundDurationCase(cyborgGrammarParser.CompoundDurationCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#compoundDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundDuration(cyborgGrammarParser.CompoundDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#absoluteDegre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteDegre(cyborgGrammarParser.AbsoluteDegreContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#relativeDegree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeDegree(cyborgGrammarParser.RelativeDegreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dieseCase}
	 * labeled alternative in {@link cyborgGrammarParser#accidental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDieseCase(cyborgGrammarParser.DieseCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bemolCase}
	 * labeled alternative in {@link cyborgGrammarParser#accidental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBemolCase(cyborgGrammarParser.BemolCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#simpleDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDuration(cyborgGrammarParser.SimpleDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#octaveNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveNumber(cyborgGrammarParser.OctaveNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link cyborgGrammarParser#dodecaNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDodecaNumber(cyborgGrammarParser.DodecaNumberContext ctx);
}