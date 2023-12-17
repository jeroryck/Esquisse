package Sketch;

import format.MasterOfFiles;
import stairCase.Mask;
import stairCase.Phrase;

import java.util.ArrayList;
import java.util.List;

import static Concepts.Duration.*;

public class FragmentTestEditing {

    static PhraseA phraseTest;
    static Mask mask = new Mask();

    public static void main(String[] args) {
        phraseTest = new PhraseA(20);
        phraseTest.populate();

        List<Boolean> maskValues = new ArrayList<>();
        List<Integer> maskPosition = new ArrayList<>();
        int maskUnitValue = NOIRE+DOUBLE;
        int populateLength = 0;
        int currentMaskPos = 0;
        while (populateLength<phraseTest.getMaxTime()){
            maskValues.add(true);
            maskValues.add(false);
            maskPosition.add(currentMaskPos);
            maskPosition.add(currentMaskPos+maskUnitValue);
            populateLength = populateLength+2*maskUnitValue;
            currentMaskPos = currentMaskPos+2*maskUnitValue;
        }
        maskPosition.add(currentMaskPos);

        mask = (Mask) mask.buildFromList(maskPosition,maskValues);

        String[] initialLy = phraseTest.lilyPondVersion(PIANO_STYLE);
        Phrase editedPhrase = (Phrase) phraseTest.edit(mask);

        MasterOfFiles masterSave = new MasterOfFiles();
        String[] editLy = editedPhrase.lilyPondVersion(PIANO_STYLE);

        for (int i = 0; i < initialLy.length; i++) {
            System.out.println(initialLy[i]);
        }
        masterSave.save(editLy, "testEditing");
        masterSave.save(initialLy,"beforeEditing");

    }
}
