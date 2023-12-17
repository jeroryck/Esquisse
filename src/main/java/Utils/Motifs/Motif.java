package Utils.Motifs;

import java.util.List;

public abstract class Motif<T> {

    // Set the motif to begin (or reset it)
    public abstract void start();

    // To know if the motif could (or not) generate a new value
    public abstract boolean hasNext();

    // update the current items (T et Duration)
    public abstract void next();

    public T currentValue;

}
