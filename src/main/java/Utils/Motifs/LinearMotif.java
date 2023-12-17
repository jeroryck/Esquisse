package Utils.Motifs;

import Concepts.Duration;
import Concepts.ListRangedValues;

import java.util.List;

// This motif generate a given series of integers.
public class LinearMotif<T> extends Motif {
    private List<T> base;
    private int state;

    public void start(){
        state =-1;
    }

    public boolean hasNext(){
        return (state<base.size()-1);
    }

    public void next(){
        if (!hasNext()) throw new RuntimeException("Linear Motif hasn't next");
        state++;
        currentValue = base.get(state);
    }

    public LinearMotif(List<T> base){
        this.base = base;
    }
}
