package format;

import Concepts.*;
import stairCase.Harmony;
import stairCase.Phrase;
import Sketch.PhraseA;
import stairCase.PitchPhrase;
import stairCase.SoundPhrase;

import java.util.ArrayList;
import java.util.List;

import static Concepts.Duration.NOIRE;
import static Concepts.Duration.STRING_CUBASE_STYLE;

public class LilyPondFormatter {

    //-------------------------------------------------------------------------------------------------
    //
    //  Generation of lilypond instruction
    //

    // auxiliary function to prevent a lilypond bug : r 16 ~ 8 should be r 16 ~ r8
    private static String glues(String pitch, String duration){
            String[] partsDur = duration.split("~");
            String result="";
        for (int i = 0; i < partsDur.length-1; i++) {
            result = result+pitch+partsDur[i]+"~";
        }
        result = result+pitch+partsDur[partsDur.length-1];
        return result;
    }

    public String[] format(Phrase phr, int style) {

        int length = phr.heights.length;
        String[] result;
        int currentIndex = 0;

        int currentDate = phr.stepRanges[0];
        // Special issue if the first date is not 0 : we add silent value to jump to this first date
        if (currentDate > 0) {
            String soundAsString = (new Pitch()).silentValue().asString();
            result = new String[length + 1];
            result[currentIndex] = glues(soundAsString,
                    Duration.asStringWithTimeSignature(currentDate, 0, style));
            currentIndex++;
        } else result = new String[length];

        for (int i = 0; i < length; i++) {
            String pitchAsString = Pitch.asString(phr.heights[i]);
            result[currentIndex] = glues(pitchAsString,
                    Duration.asStringWithTimeSignature(phr.getStepLength(i), currentDate, style));
            currentDate = currentDate + phr.getStepLength(i);
            currentIndex++;
        }
        return result;
    }
        public String[] format(PitchPhrase phr, int style){

            int length = phr.heights.length;
            String[] result ;
            int currentIndex = 0;

            int currentDate = phr.stepRanges[0];
            // Special issue if the first date is not 0 : we add silent value to jump to this first date
            if (currentDate>0) {
                String soundAsString = (new Pitch()).silentValue().asString();
                result = new String[length+1];
                result[currentIndex] = glues(soundAsString,
                        Duration.asStringWithTimeSignature(currentDate,0,style));
                currentIndex++;
            }
            else result = new String[length];

            for (int i=0;i<length;i++){
                String pitchAsString = Pitch.asString(phr.heights[i].index);
                result[currentIndex] = glues(pitchAsString,
                        Duration.asStringWithTimeSignature(phr.getStepLength(i),currentDate,style));
                currentDate = currentDate +phr.getStepLength(i);
                currentIndex++;
            }
        return result;
    }

    public String[] format(SoundPhrase phr, int style){

        int length = phr.heights.length;

        String[] result ;
        int currentIndex = 0;

        int currentDate = phr.stepRanges[0];
        // Special issue if the first date is not 0 : we add silent value to jump to this first date
        if (currentDate>0) {
            String soundAsString = (new Pitch()).silentValue().asString();
            result = new String[length+1];
            result[currentIndex] = glues(soundAsString,
                    Duration.asStringWithTimeSignature(currentDate,0,style));
            currentIndex++;
        }
        else result = new String[length];

        for (int i=0;i<length;i++){
            String soundAsString = (phr.heights[i]).asString();
            result[currentIndex] = glues(soundAsString,
                    Duration.asStringWithTimeSignature(phr.getStepLength(i),currentDate,style));
            currentDate = currentDate +phr.getStepLength(i);
            currentIndex++;
        }
        return result;
    }

    public String[] format(Harmony harm,int style){
        int length = harm.heights.length;
        String[] result;
        int currentIndex = 0;

        int currentDate =harm.stepRanges[0];
        // Special issue if the first date is not 0 : we add silent value to jump to this first date
        if (currentDate>0) {
            String soundAsString = (new Pitch()).silentValue().asString();
            result = new String[length+1];
            result[currentIndex] = glues(soundAsString,
                    Duration.asStringWithTimeSignature(currentDate,0,style));
            currentIndex++;
        }
        else result = new String[length];

        for (int i=0;i <length;i++){
            String chordAsString = harm.heights[i].asString();
            result[currentIndex] = glues(chordAsString,
                    Duration.asStringWithTimeSignature(harm.getStepLength(i),currentDate,style));
            currentDate = currentDate +harm.getStepLength(i);
            currentIndex++;
        }
        return  result;
    }

    public String[] format(ListRangedPitch lrp, int style) {

        int size = lrp.size();
        String[] result = new String[size];
        int currentDate = 0;

        for (int i = 0; i < size; i++) {
            String pitchAsString = ((Pitch) lrp.getValue(i)).asString();
            int duration = ((Duration) lrp.getRange(i)).intValue;
            result[i] = glues(pitchAsString,
                    Duration.asStringWithTimeSignature(duration,currentDate,style));
            currentDate = currentDate +duration;
        }

        return result;
    }

    public String[] format(ListRangedHarmonicPitch lrp, int style) {

        int size = lrp.size();
        String[] result = new String[size];
        int currentDate = 0;

        for (int i = 0; i < size; i++) {
            String pitchAsString = ((HarmonicPitch) lrp.getValue(i)).asString();
            int duration = ((Duration) lrp.getRange(i)).intValue;
            result[i] = glues(pitchAsString,
                    Duration.asStringWithTimeSignature(duration,currentDate,style));
            currentDate = currentDate +duration;
        }

        return result;
    }

    public static void main(String[] args) {

        PhraseA phraseA = new PhraseA(50);
        phraseA.populate();String[] generated = (new LilyPondFormatter()).format(phraseA,STRING_CUBASE_STYLE);

        (new MasterOfFiles()).save(generated, "phraseA");
        
    }
}
