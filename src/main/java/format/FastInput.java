package format;

import Concepts.Duration;
import Concepts.HarmonicPitch;

import java.util.ArrayList;
import java.util.List;

//------------------------------------------------------------------------------------------------------
//
//  A collection of static function to facilitate data input for various data type
//  Specially usefully to describe motif or grace
//

public class FastInput {

    // Construct Harmonic pitch moves from a list of integers
    public static List<HarmonicPitch.Move> hp(int[] codedMove){
        List<HarmonicPitch.Move> result = new ArrayList<>();
        for (int i = 0; i < codedMove.length; i++) {
            result.add(new HarmonicPitch.Move(codedMove[i]));
        }
        return result;
    }

    // Construct Durations from a list of integers (each corresponding to the number of quadruple in the duration)
    public static List<Duration> dur(int[] codedDuration){
        List<Duration> result = new ArrayList<>();
        for (int i = 0; i < codedDuration.length; i++) {
            result.add(new Duration(codedDuration[i]));
        }
        return result;
    }
}
