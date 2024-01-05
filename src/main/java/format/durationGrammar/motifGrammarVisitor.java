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
	 * Visit a parse tree produced by {@link motifGrammarParser#motif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMotif(motifGrammarParser.MotifContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#seriesMotif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeriesMotif(motifGrammarParser.SeriesMotifContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#orMotif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrMotif(motifGrammarParser.OrMotifContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#loopMotif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopMotif(motifGrammarParser.LoopMotifContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#loopNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopNumber(motifGrammarParser.LoopNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#linearMotif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinearMotif(motifGrammarParser.LinearMotifContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#linearMotifDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinearMotifDuration(motifGrammarParser.LinearMotifDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#linearMotifPitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinearMotifPitch(motifGrammarParser.LinearMotifPitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#linearMotifMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinearMotifMove(motifGrammarParser.LinearMotifMoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#pitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPitch(motifGrammarParser.PitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#absolutePitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePitch(motifGrammarParser.AbsolutePitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#relativePitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePitch(motifGrammarParser.RelativePitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#simplePitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePitch(motifGrammarParser.SimplePitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#pitchName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPitchName(motifGrammarParser.PitchNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#octaveNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveNumber(motifGrammarParser.OctaveNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#octaveModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveModifier(motifGrammarParser.OctaveModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(motifGrammarParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#moveNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveNumber(motifGrammarParser.MoveNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#durationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDurationSpec(motifGrammarParser.DurationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(motifGrammarParser.DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#compoundDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundDuration(motifGrammarParser.CompoundDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#simpleDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDuration(motifGrammarParser.SimpleDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link motifGrammarParser#mute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMute(motifGrammarParser.MuteContext ctx);
}