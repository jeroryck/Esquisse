package Components.Voicing;

//
//  This class creates voicing for a chord time series ("Harmony")
//  The created voicings respect the "voicingConstraints"
//

import Concepts.Chord;
import Concepts.PitchConstraint;
import stairCase.Harmony;

import java.util.List;
import java.util.Optional;

public class SmoothVoicer {

    List<PitchConstraint> voicingConstraints;
    public List<PitchConstraint> getVoicingConstraints() {
        return voicingConstraints;}
    public void setVoicingConstraints(List<PitchConstraint> voicingConstraints) {
        this.voicingConstraints = voicingConstraints;}

    //----------------------------------------------------------------------------------------------------------
    //
    // Core function
    // model just give the pattern of disposition for the first voicing. It is not a part of the result.

    public Harmony addVoicings(Harmony harmony, Chord model){

        if (harmony.chordCardinal != voicingConstraints.size()) {
            System.out.println("chords and voicing constraint have not the same size");
            return null;
        }
        Harmony voicedHarm = new Harmony();
        voicedHarm.stepRanges = new Integer[harmony.stepRanges.length];
        System.arraycopy(harmony.stepRanges,0,voicedHarm.stepRanges,0,harmony.stepRanges.length);
        voicedHarm.heights = new Chord[harmony.heights.length];
        voicedHarm.chordCardinal = harmony.chordCardinal;

        Chord predecessor = model;
        for (int i = 0; i < harmony.heights.length; i++) {
            Chord current = harmony.heights[i];

            // Search the closest voicing to predecessor
            List<Chord> voicings = current.constructsVoicing(voicingConstraints);
            Chord bestVoicing = predecessor.minimizeChordDistance(voicings);
            voicedHarm.heights[i]=bestVoicing;
            predecessor = bestVoicing;
        }
        return voicedHarm;
    }

    public SmoothVoicer(){}
    public SmoothVoicer(List<PitchConstraint> constraints){
        voicingConstraints = constraints;
    }
}
