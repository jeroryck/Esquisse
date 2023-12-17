package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Alea {

    static Random rand = new Random();

    public static int oneOf(int[] possibilities){
        int index = rand.nextInt(0,possibilities.length);
        return possibilities[index];
    }

    public static Object oneOf(Object[] possibilities){
        int index = rand.nextInt(0,possibilities.length);
        return possibilities[index];
    }

    // n chance out of m
    public static boolean chanceOutOf(int n, int m){
        int index = rand.nextInt(0,m);
        if (index < n) return true;
        else return false;
    }

    // n integer values from {1 .. m}
    public static List<Integer> nAmongM(int n, int m){
        List<Integer> result = new ArrayList<>();

        // An list of the [1..m] values
        List<Integer>  urn = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            urn.add(i);
        }

        // Choice of the n values
        for (int i = 0; i < n; i++) {
            int index = rand.nextInt(0,urn.size());
            result.add(urn.get(index));
            urn.remove(index);
        }

        return result;
    }

}
