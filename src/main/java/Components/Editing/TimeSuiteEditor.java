package Components.Editing;

import stairCase.Mask;
import stairCase.TimeSuite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TimeSuiteEditor {

    Mask mask;

    public TimeSuite edit(TimeSuite suiteToEdit){

        List<Integer> pointsStep = new ArrayList<>();

        for (int i = 0; i < suiteToEdit.dates.length; i++) {
            if (mask.getValue(suiteToEdit.dates[i]))
                pointsStep.add(suiteToEdit.dates[i]);
        }

        return suiteToEdit.buildFromArray(pointsStep.toArray(new Integer[0]));
    }
}
