package Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CombinationGenerator {

        //----------------------------------------------------------------------------------------------------
        //
        // In all possible order, Pick m red ball and n yellow ball in an urn.
        public static List<String> generateOrderedCombinations(int m, int n) {
            List<String> result = new ArrayList<>();
            generateCombinations("", m, n, result);
            return result;
        }

        private static void generateCombinations(String currentCombination, int remainingRed, int remainingYellow, List<String> result) {
            // Base case: no more balls left to add
            if (remainingRed == 0 && remainingYellow == 0) {
                result.add(currentCombination);
                return;
            }

            // Recursive cases: add a red ball or a yellow ball
            if (remainingRed > 0) {
                generateCombinations(currentCombination + "R", remainingRed - 1, remainingYellow, result);
            }

            if (remainingYellow > 0) {
                generateCombinations(currentCombination + "Y", remainingRed, remainingYellow - 1, result);
            }
        }

        //---------------------------------------------------------------------------------------------------------------
        //
        // In all order possible, pick i green ball, j red ball and k yellow ball

        public static List<String> orderedUrnPick(int i, int j, int k){
            List<String> result = new ArrayList<>();
            urnPick("",i,j,k,result);
            return result;
        }
        private static void urnPick(String currentCombination,
                                    int remainingGreen, int remainingRed, int remainingYellow,
                                    List<String> result){
            // Base case : urn is empty
            if (remainingRed == 0 && remainingYellow == 0 && remainingGreen == 0){
                result.add(currentCombination);
                return;
            }

            // Recursive cases : pick a ball of each remaining colors
            if (remainingGreen > 0) {
                urnPick(currentCombination + "G", remainingGreen-1,remainingRed, remainingYellow, result);
            }
            if (remainingRed > 0) {
                urnPick(currentCombination + "R", remainingGreen,remainingRed-1, remainingYellow, result);
            }
            if (remainingYellow > 0) {
                urnPick(currentCombination + "Y", remainingGreen,remainingRed, remainingYellow-1, result);
            }
        }

        //---------------------------------------------------------------------------------------------------------------
        //
        // In random order, pick i green ball, j red ball and k yellow ball

        public static String randomUrnPick(int i, int j, int k){
            String result = "";
            List<String> ls = new ArrayList<>();
            for (int l = 0; l < i; l++) {
                ls.add("G");
            }
            for (int l = i; l < i+ j; l++) {
                ls.add("R");
            }
            for (int l = i+j; l < i+j+ k; l++) {
                ls.add("Y");
            }
            Collections.shuffle(ls);

            for (int l = 0; l < i+j+k; l++) {
                result = result+ls.get(l);
            }
            return result;
        }


        //---------------------------------------------------------------------------------------------------------------
        // Test main program
        //


        public static void main(String[] args) {
            int m = 2; // Number of red balls
            int n = 20; // Number of yellow balls

            List<String> combinations = generateOrderedCombinations(m, n);

            // Print the generated combinations
            System.out.println("Ordered Combinations for two colors :");
            for (String combination : combinations) {
                System.out.println(combination);
            }

            // Now, we add green balls ...
            int p = 4;
            combinations = orderedUrnPick(p,m,n);
            System.out.println("Ordered Combinations for three colors :");
            for (String combination : combinations) {
                System.out.println(combination);
            }
        }
    }


