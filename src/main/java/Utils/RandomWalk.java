package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Utils.CombinationGenerator.orderedUrnPick;
import static Utils.CombinationGenerator.randomUrnPick;

public class RandomWalk {

    // unidimensional random walk in the integers

    // Sub problem : Give all the possibilities to join zero to end in stepNumber steps
    // this function works with moves , step by  step upward or downward
    // Preferentially, we use unit steps (upward, downward). If needed, we add a bigger extra step.
    // To achieve, we generate the permutation of the different steps to find all possible path
    // The permutations are computed by urn picking : Red ball is +1 step, Yellow ball is -1 step, Green ball
    // has various value to ensure a feasible solution

    static private class Urn {
        int redBallNumber;
        int yellowBallNumber;
        int greenBallNumber;
        int greenBallValue;

    }
    static Urn urn = new Urn();

    // first function : determine the number of balls for the different colors
    // starting to 0, going to end in stepNumbers steps.
    static private void setUrn(int end, int stepNumbers) {
        int redBallNumber;
        int yellowBallNumber;
        int greenBallNumber;
        int greenBallValue = 0;

        if (stepNumbers < end) {
            redBallNumber= stepNumbers-1;
            yellowBallNumber = 0;
            greenBallNumber=1;
            greenBallValue=end-stepNumbers+1;
        }
        else {
            if ((stepNumbers - end) % 2 == 1) {
                // number : (end -1+ stepNumber/2 +1/2 -end/2) -1+(stepNumber/2 +1/2 -end/2)+1
                //          = stepNumber
                // somme (end -1 + stepNumber/2 +1/2 -end/2)-1 -stepNumber/2-1/2+end/2)+2
                //          = end
                redBallNumber = end-1  +(stepNumbers-end+1)/2-1;
                yellowBallNumber = (stepNumbers-end+1)/2 ;
                greenBallNumber = 1;
                greenBallValue = 2;
            }
            else {
                redBallNumber = end +(stepNumbers-end)/2;
                yellowBallNumber = (stepNumbers-end)/2;
                greenBallNumber = 0;
            }
        };
        urn.greenBallNumber = greenBallNumber;
        urn.greenBallValue = greenBallValue;
        urn.redBallNumber = redBallNumber;
        urn.yellowBallNumber = yellowBallNumber;
        System.out.println("G :"+greenBallNumber+" R :"+redBallNumber+" Y :"+yellowBallNumber);

    }

    public static List<List<Integer>> movesFromZeroToEnd(int end, int stepNumbers){

        // first : determine the number of balls for the different colors
        setUrn(end,stepNumbers);

        // then compute all possible permutations
        // The permutations are coded as a string. Each character is the color of a picked ball in the urn
        List<String> codedPermutations = orderedUrnPick(urn.greenBallNumber,urn.redBallNumber,urn.yellowBallNumber);
        System.out.println("Permutations :");

        // Decode the permutation : each ball is translated as a move.
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < codedPermutations.size(); i++) {
            result.add(decodePermutation(codedPermutations.get(i),urn.greenBallValue));
        }

        return result;
    }

    public static List<Integer> oneMoveFromZeroToEnd(int end, int stepNumbers){

        // first : determine the number of balls for the different colors
        setUrn(end,stepNumbers);

        // Compute a path
        String codedPermutation = randomUrnPick(urn.greenBallNumber,urn.redBallNumber,urn.yellowBallNumber);

        // Decode as moves
        return decodePermutation(codedPermutation,urn.greenBallValue);
    }


    private static List<Integer> decodePermutation(String permut, int greenBallValue){
        List<Integer> newList = new ArrayList<>();
        char [] toProceed = permut.toCharArray();
        for (int j = 0; j < toProceed.length; j++) {
            switch (toProceed[j]) {
                case 'R' : newList.add(1); break;
                case 'G' : newList.add(greenBallValue); break;
                case 'Y' : newList.add(-1); break;
            }
        }

        return newList;
    }

    //---------------------------------------------------------------------------------------------------------------

    // All the possible path between two integers (enumerate the passing integers)
    public static List<List<Integer>> closedWalks(int beginning, int end, int pathLength){

        int way;
        List<List<Integer>> moves;

        // We compute moves, so the number of moves is the number of position minus one
        // if end < beginning, we compute move in the other way
        if (end >= beginning) {
             moves = movesFromZeroToEnd(end - beginning, pathLength - 1);
            way = 1;
        }
        else {
            moves = movesFromZeroToEnd(beginning-end, pathLength - 1);
            way = -1;
        }

        // Now, we create paths form the sequences of move
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < moves.size(); i++) {
            List<Integer> movesToDecode = moves.get(i);
            List<Integer> path = new ArrayList<>();
            path.add(beginning);
            for (int j = 0; j < movesToDecode.size(); j++) {
                int endPath = path.get(path.size()-1);
                path.add(endPath+way*movesToDecode.get(j));
            }
            result.add(path);
        }
        return result;
    }

    // A single path between two integers (enumerate the passing integers)
    public static List<Integer> closedWalk(int beginning, int end, int pathLength){
        int way;
        List<Integer> moves;

        // We compute moves, so the number of moves is the number of position minus one
        // if end < beginning, we compute move in the other way
        if (end >= beginning) {
            moves = oneMoveFromZeroToEnd(end - beginning, pathLength - 1);
            way = 1;
        }
        else {
            moves = oneMoveFromZeroToEnd(beginning-end, pathLength - 1);
            way = -1;
        }

        // Now, we create the form the sequences of move
        List<Integer> path = new ArrayList<>();
        path.add(beginning);
        for (int j = 0; j < moves.size(); j++) {
            int endPath = path.get(path.size()-1);
            path.add(endPath+way*moves.get(j));
        }
        return path;
    }

    public static void main(String[] args) {
        List<List<Integer>> paths = closedWalks(8,3,2);
        for (int i = 0; i < paths.size(); i++) {
            System.out.println(paths.get(i));
        }
    }
}
