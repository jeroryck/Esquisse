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
	 * Enter a parse tree produced by {@link motifGrammarParser#motif}.
	 * @param ctx the parse tree
	 */
	void enterMotif(motifGrammarParser.MotifContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#motif}.
	 * @param ctx the parse tree
	 */
	void exitMotif(motifGrammarParser.MotifContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#seriesMotif}.
	 * @param ctx the parse tree
	 */
	void enterSeriesMotif(motifGrammarParser.SeriesMotifContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#seriesMotif}.
	 * @param ctx the parse tree
	 */
	void exitSeriesMotif(motifGrammarParser.SeriesMotifContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#orMotif}.
	 * @param ctx the parse tree
	 */
	void enterOrMotif(motifGrammarParser.OrMotifContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#orMotif}.
	 * @param ctx the parse tree
	 */
	void exitOrMotif(motifGrammarParser.OrMotifContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#loopMotif}.
	 * @param ctx the parse tree
	 */
	void enterLoopMotif(motifGrammarParser.LoopMotifContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#loopMotif}.
	 * @param ctx the parse tree
	 */
	void exitLoopMotif(motifGrammarParser.LoopMotifContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#loopNumber}.
	 * @param ctx the parse tree
	 */
	void enterLoopNumber(motifGrammarParser.LoopNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#loopNumber}.
	 * @param ctx the parse tree
	 */
	void exitLoopNumber(motifGrammarParser.LoopNumberContext ctx);
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
	 * Enter a parse tree produced by {@link motifGrammarParser#linearMotifDuration}.
	 * @param ctx the parse tree
	 */
	void enterLinearMotifDuration(motifGrammarParser.LinearMotifDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#linearMotifDuration}.
	 * @param ctx the parse tree
	 */
	void exitLinearMotifDuration(motifGrammarParser.LinearMotifDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#linearMotifPitch}.
	 * @param ctx the parse tree
	 */
	void enterLinearMotifPitch(motifGrammarParser.LinearMotifPitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#linearMotifPitch}.
	 * @param ctx the parse tree
	 */
	void exitLinearMotifPitch(motifGrammarParser.LinearMotifPitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#linearMotifPitchMove}.
	 * @param ctx the parse tree
	 */
	void enterLinearMotifPitchMove(motifGrammarParser.LinearMotifPitchMoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#linearMotifPitchMove}.
	 * @param ctx the parse tree
	 */
	void exitLinearMotifPitchMove(motifGrammarParser.LinearMotifPitchMoveContext ctx);
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
	 * Enter a parse tree produced by {@link motifGrammarParser#absolutePitch}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePitch(motifGrammarParser.AbsolutePitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#absolutePitch}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePitch(motifGrammarParser.AbsolutePitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#relativePitch}.
	 * @param ctx the parse tree
	 */
	void enterRelativePitch(motifGrammarParser.RelativePitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#relativePitch}.
	 * @param ctx the parse tree
	 */
	void exitRelativePitch(motifGrammarParser.RelativePitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#simplePitch}.
	 * @param ctx the parse tree
	 */
	void enterSimplePitch(motifGrammarParser.SimplePitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#simplePitch}.
	 * @param ctx the parse tree
	 */
	void exitSimplePitch(motifGrammarParser.SimplePitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#pitchName}.
	 * @param ctx the parse tree
	 */
	void enterPitchName(motifGrammarParser.PitchNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#pitchName}.
	 * @param ctx the parse tree
	 */
	void exitPitchName(motifGrammarParser.PitchNameContext ctx);
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
	 * Enter a parse tree produced by {@link motifGrammarParser#octaveModifier}.
	 * @param ctx the parse tree
	 */
	void enterOctaveModifier(motifGrammarParser.OctaveModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#octaveModifier}.
	 * @param ctx the parse tree
	 */
	void exitOctaveModifier(motifGrammarParser.OctaveModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#pitchMove}.
	 * @param ctx the parse tree
	 */
	void enterPitchMove(motifGrammarParser.PitchMoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#pitchMove}.
	 * @param ctx the parse tree
	 */
	void exitPitchMove(motifGrammarParser.PitchMoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#pitchMoveNumber}.
	 * @param ctx the parse tree
	 */
	void enterPitchMoveNumber(motifGrammarParser.PitchMoveNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#pitchMoveNumber}.
	 * @param ctx the parse tree
	 */
	void exitPitchMoveNumber(motifGrammarParser.PitchMoveNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#durationSpec}.
	 * @param ctx the parse tree
	 */
	void enterDurationSpec(motifGrammarParser.DurationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#durationSpec}.
	 * @param ctx the parse tree
	 */
	void exitDurationSpec(motifGrammarParser.DurationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link motifGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(motifGrammarParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(motifGrammarParser.DurationContext ctx);
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
	 * Enter a parse tree produced by {@link motifGrammarParser#mute}.
	 * @param ctx the parse tree
	 */
	void enterMute(motifGrammarParser.MuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link motifGrammarParser#mute}.
	 * @param ctx the parse tree
	 */
	void exitMute(motifGrammarParser.MuteContext ctx);
}