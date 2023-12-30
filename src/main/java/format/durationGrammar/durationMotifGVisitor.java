// Generated from C:/Users/eva/Documents/MusicSoftware/Esquisse/src/main/java/format/durationGrammar/durationMotifG.g4 by ANTLR 4.13.1
package format.durationGrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link durationMotifGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface durationMotifGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link durationMotifGParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(durationMotifGParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link durationMotifGParser#linearMotif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinearMotif(durationMotifGParser.LinearMotifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEventGenerator}
	 * labeled alternative in {@link durationMotifGParser#generator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEventGenerator(durationMotifGParser.SingleEventGeneratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEventPitchCase}
	 * labeled alternative in {@link durationMotifGParser#singleEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEventPitchCase(durationMotifGParser.SingleEventPitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEventDegreCase}
	 * labeled alternative in {@link durationMotifGParser#singleEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEventDegreCase(durationMotifGParser.SingleEventDegreCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relativeEventDegreCase}
	 * labeled alternative in {@link durationMotifGParser#singleEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeEventDegreCase(durationMotifGParser.RelativeEventDegreCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link durationMotifGParser#pitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPitch(durationMotifGParser.PitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleDurationCase}
	 * labeled alternative in {@link durationMotifGParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDurationCase(durationMotifGParser.SimpleDurationCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundDurationCase}
	 * labeled alternative in {@link durationMotifGParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundDurationCase(durationMotifGParser.CompoundDurationCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link durationMotifGParser#compoundDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundDuration(durationMotifGParser.CompoundDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link durationMotifGParser#absoluteDegre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteDegre(durationMotifGParser.AbsoluteDegreContext ctx);
	/**
	 * Visit a parse tree produced by {@link durationMotifGParser#relativeDegree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeDegree(durationMotifGParser.RelativeDegreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dieseCase}
	 * labeled alternative in {@link durationMotifGParser#accidental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDieseCase(durationMotifGParser.DieseCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bemolCase}
	 * labeled alternative in {@link durationMotifGParser#accidental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBemolCase(durationMotifGParser.BemolCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link durationMotifGParser#simpleDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDuration(durationMotifGParser.SimpleDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link durationMotifGParser#octaveNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveNumber(durationMotifGParser.OctaveNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link durationMotifGParser#dodecaNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDodecaNumber(durationMotifGParser.DodecaNumberContext ctx);
}