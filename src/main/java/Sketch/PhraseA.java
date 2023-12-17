package Sketch;

import format.LilyPondFormatter;
import stairCase.Phrase;

import java.util.Random;

//
//  Generation of a single line
//

public class PhraseA extends Phrase {

    static final    LilyPondFormatter lilyFormatter = new LilyPondFormatter();

    // Soprano de l'harmonie. Le pas élementaire est la croche

    Integer[] possibleMoves;
    Integer stepLength = 1;

    Integer numberStepMax;
    Integer firstValue;

    public void populate(){
        Random random = new Random();

        // first values
        heights[0]=firstValue;
        heights[1]=firstValue;
        stepRanges[0]= 0;
        stepRanges[1]=stepLength;

        // next values
        for (int i = 1; i < numberStepMax; i++) {
            int randomIndex = random.nextInt(possibleMoves.length-1);
            heights[i]=heights[i-1]+possibleMoves[randomIndex];
            stepRanges[i+1]= stepRanges[i]+stepLength;
        }

        System.out.println("Phrase A populated :");


    }


    public PhraseA(int stepNumber) {

        heights = new Integer[stepNumber];
        stepRanges = new Integer[stepNumber+1];

        possibleMoves = new Integer[]{1, 2, 3, 4, 5, 6,-1,-2,-4,-5,-6};
        numberStepMax = stepNumber;
        firstValue = 50;
        stepLength = 48;
        name = "phraseA";
    }

    public PhraseA(){

    }
}
