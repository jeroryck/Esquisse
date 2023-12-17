package Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationGenerator {


    public static List<List<Integer>> generatePermutations(Integer[] array) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(array, 0, result);
        return result;
    }

    private static void generatePermutations(Integer[] array, int index, List<List<Integer>> result) {
        if (index == array.length - 1) {
            // Base case: reached the end of the array
            result.add(new ArrayList<>(Arrays.asList(array)));
        } else {
            // Recursive case: swap current element with each element to its right
            for (int i = index; i < array.length; i++) {
                if (array[index] != array[i]) {
                    swap(array, index, i);
                    generatePermutations(array, index + 1, result);
                    swap(array, index, i); // backtrack
                }
            }
        }
    }

    private static void swap(Integer[] array, int i, int j) {
        Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        List<List<Integer>> permutations = generatePermutations(array);

        // Print the generated permutations
        System.out.println("Permutations:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
