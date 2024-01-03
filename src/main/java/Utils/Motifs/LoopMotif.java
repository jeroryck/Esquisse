package Utils.Motifs;

public class LoopMotif<T> extends Motif
{
    // The repeated motif
    Motif motif;

    // The max number of repetition
    int repeatNumber;

    // the current number of repetition
    int state;

    @Override
    public void start() {
        state = 1;
        motif.start();
    }

    @Override
    public boolean hasNext() {
        return (state <= repeatNumber -1) || ((state == repeatNumber) &&(motif.hasNext()));
    }

    @Override
    public void next() {
        if (motif.hasNext()) {
            motif.next();
        } else {
            if (hasNext()) {
                state++;
                motif.start();
                motif.next();
            }
        }
        currentValue = motif.currentValue;
    }

    public LoopMotif(Motif motif, int repeatNumber){
        this.motif = motif;
        this.repeatNumber = repeatNumber;

    }
}
