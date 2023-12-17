package Components.Voicing;

//
//  This class creates voicing for a chord time series ("Harmony")
//  The created voicings respect the "voicingConstraints"
//

import Concepts.Chord;
import Concepts.PitchConstraint;
import stairCase.Harmony;

import java.util.List;

public class AngularVoicer {

    List<PitchConstraint> voicingConstraints;
    public List<PitchConstraint> getVoicingConstraints() {
        return voicingConstraints;}
    public void setVoicingConstraints(List<PitchConstraint> voicingConstraints) {
        this.voicingConstraints = voicingConstraints;}

    public Harmony addVoicings(Harmony harmony){

        if (harmony.chordCardinal != voicingConstraints.size()) {
            System.out.println("chords and voicing constraint have not the same size");
            return null;
        }
        Harmony voicedHarm = new Harmony();
        voicedHarm.stepRanges = new Integer[harmony.stepRanges.length];
        System.arraycopy(harmony.stepRanges,0,voicedHarm.stepRanges,0,harmony.stepRanges.length);
        voicedHarm.heights = new Chord[harmony.heights.length];
        voicedHarm.chordCardinal = harmony.chordCardinal;

        for (int i = 0; i < harmony.heights.length; i++) {
            Chord voicing = harmony.heights[i].pickVoicing(voicingConstraints);
            voicedHarm.heights[i]=voicing;
        }
        return voicedHarm;
    }

    public AngularVoicer(){}
    public AngularVoicer(List<PitchConstraint> constraints){
        voicingConstraints = constraints;
    }
}
