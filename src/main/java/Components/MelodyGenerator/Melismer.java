package Components.MelodyGenerator;

import Concepts.*;
import Utils.PermutationGenerator;
import Utils.RandomWalk;
import format.MasterOfFiles;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

import static Concepts.Duration.*;
import static Concepts.PitchConstraint.ALTO_RANGE;
import static Concepts.PitchConstraint.VIOLIN_RANGE;

public  class Melismer {

    public Scale scale;

    public Integer durationUnit;

    // Find a path in the scale between two pithc. Note that pathLength is hp1 and hp2 included.
    public ListRangedValues<Pitch, Duration> extrapolate(Pitch hp1, Pitch hp2, int pathLength){
        ListRangedValues<Pitch, Duration> result = new ListRangedValues<>();

        // Search beginning and end index of the melisma in the scale
        int beginningIndex;
        int endIndex;

        if (scale.degreeDown(hp1).isPresent())
            beginningIndex = scale.degreeDown(hp1).get();
        else if (scale.degreeUp(hp1).isPresent())
            beginningIndex = scale.degreeUp(hp1).get();
        else throw new RuntimeException("error in melismer : beginning is not in the scale");
        if (scale.degreeDown(hp2).isPresent())
            endIndex = scale.degreeDown(hp2).get();
        else if (scale.degreeUp(hp2).isPresent())
            endIndex = scale.degreeUp(hp2).get();
        else throw new RuntimeException("error in melismer : end is not in the scale");

        // Generate the index of the values in the ascending or descending scale
        List<Integer> melismaIndex = RandomWalk.closedWalk(beginningIndex,endIndex,pathLength);

        // Use these index to generate the successive pitches
        for (int i = 0; i < melismaIndex.size(); i++) {
            if (i==0) {
                // by convention, we begin by ascending scale
                result.addValue(scale.pitchesUp.get(melismaIndex.get(i)));
                result.addRange(new Duration(durationUnit));
            }
            else {
                if (melismaIndex.get(i) <= melismaIndex.get(i-1))
                    result.addValue(scale.pitchesUp.get(melismaIndex.get(i)));
                else result.addValue(scale.pitchesDown.get(melismaIndex.get(i)));
                result.addRange(new Duration(durationUnit));
            }
        }


        return result;
    }

    public Melismer(){};


    public static void main(String[] args) {

        Walker walker = new Walker(4,1,3);
        walker.durationUnit = CROCHE;
        Chord chordTones = new Chord(new String[]{"c'", "ees'","aes'","b'"});
        HarmonicPitch start = new HarmonicPitch(Pitch.asInt("c''"), chordTones);
        ListRangedHarmonicPitch generated = walker.generate(start,1000);


        Melismer melismer = new Melismer();
        melismer.durationUnit = CROCHE;
        Scale scale = new Scale(VIOLIN_RANGE, chordTones);
        scale.populate(chordTones);
        melismer.scale = scale;

        ListRangedPitch melismed = new ListRangedPitch();
        for (int i = 0; i < generated.size()-1; i++) {
            Pitch p1 =new Pitch( ( (HarmonicPitch) generated.getValue(i)).asPitch());
            Pitch p2 =new Pitch( ( (HarmonicPitch) generated.getValue(i+1)).asPitch());
            int intDur = generated.getRange(i).intValue();
            int stepNumber = intDur/melismer.durationUnit;
            ListRangedValues extrapolation = melismer.extrapolate(p1,p2, stepNumber+1);

             System.out.println("Join "+p1.asString()+" et "+p2.asString());

            // To avoid repetition, we suppress the first pitch of the new melism (it is the last pitch of the previous)
            // except for the first.
            if (i==0)
                melismed.concat(extrapolation);
            else {
                extrapolation.suppress(0);
                melismed.concat(extrapolation);
            }
        }

        for (int i = 0; i < melismed.size(); i++) {
            System.out.println(((Pitch) melismed.getValue(i)).asString());
        }

        MasterOfFiles masterSave = new MasterOfFiles();
        masterSave.subDirectoryName = "Melisme";

        String[] violon1Ly = melismed.lilyPondVersion(PIANO_STYLE);
        masterSave.save(violon1Ly,"violon1");

        String[] violon2Ly =generated.lilyPondVersion(PIANO_STYLE);
        masterSave.save(violon2Ly,"chordTones");

    }
}