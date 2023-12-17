package Components;


//
//  Generation of a chord Time series,
//  This series is build from a "baseOfChord", transposed following a set
//  of "possibleMoves". Each move is selected in respect of a "range".
//  The duration of each chord is "stepSize"
//
// To use this class :
//      -> implement baseOfChord
//      -> implement stepSize
//      -> call populate(t) to generate the suite form date t
//

import Concepts.Chord;
import Concepts.PitchConstraint;
import stairCase.Harmony;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class ChordSuite extends Harmony {

    // the "populate" method, wich compute the chord suite, uses different values:
    //  . a base chord which is transposed at each step
    //  . a step size, giving the duration of each step
    //  . a set of possible move, to compute the transposition of each step

    public abstract Chord baseOfChord(int date) ;

    public abstract Integer stepSize(int date);

    public abstract Integer[] possibleMoves(int date) ;

    public abstract int getMaxTime();

    //--------------------------------------------------------------------------------------------------------

    public void populate(int date){

        Random random = new Random();
        List<Chord> population = new ArrayList<>();
        List<Integer> stepRangeList = new ArrayList<>();

        // first values
        population.add(baseOfChord(date));
        stepRangeList.add(0);
        stepRangeList.add(stepSize(date));
        int currentDate = date;

        //complete the initialization
        chordCardinal = baseOfChord(date).pitchs.length;


        // next values
        int maxRange = getMaxTime();
        int i =0;
        int currentRange = stepRangeList.get(1);
        Chord candidate = null;
        while (currentRange <= maxRange) {
            i++;
            Boolean succes = false;
            while (succes==false) {
                int randomIndex = random.nextInt(possibleMoves(currentDate).length );
                int newRoot = population.get(i-1).getRoot()+possibleMoves(currentDate)[randomIndex];
                candidate = baseOfChord(currentDate).setRoot(newRoot);
                if (getRange().contains(newRoot)) succes = true;
            }
            population.add(candidate);
            stepRangeList.add(i+1,stepRangeList.get(i)+stepSize(currentDate));
            currentRange = currentRange+stepSize(currentDate);
            currentDate = currentDate+stepSize(currentDate);
        }
        heights = new Chord[population.size()];
        for (int j = 0; j < population.size(); j++) {
            heights[j] = population.get(j);
        }
        stepRanges = new Integer[stepRangeList.size()];
        for (int j = 0; j < stepRangeList.size(); j++) {
            stepRanges[j] = stepRangeList.get(j);
        }
    }

    //--------------------------------------------------------------------------------------------------


    public ChordSuite(){

    }
}
