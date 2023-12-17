package Utils;

import Concepts.TimedRange;

import java.util.ArrayList;

public class TimedIntegerArrayList extends ArrayList<Integer>  implements TimedRange {
    @Override
    public int intValue() {
        int sum =0;
        for (int i = 0; i < this.size(); i++) {
            sum = sum+this.get(i);
        }
        return sum;
    }
}
