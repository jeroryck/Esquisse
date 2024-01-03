package Utils.Motifs;

import java.util.List;

public class SeriesMotif<T> extends Motif {

    // this motif activates successively an array of given motifs

    private List<Motif<T>> motifs;

    private Motif<T> currentMotif;

    private int indexCurrentMotif;

    public void start(){ indexCurrentMotif =0; currentMotif = motifs.get(0); currentMotif.start();}

    public boolean hasNext(){
        return ((indexCurrentMotif < motifs.size()-1) || currentMotif.hasNext());
    }


    public void next(){
        if (!hasNext()) throw new RuntimeException("Linear Motif hasn't next");
        if (currentMotif.hasNext()) {currentMotif.next(); currentValue = currentMotif.currentValue;}
        else {
            indexCurrentMotif++;
            currentMotif = motifs.get(indexCurrentMotif);
            currentMotif.start();currentMotif.next();
            currentValue = currentMotif.currentValue;
        }

    }

    //--------------------------------------------------------------------------------------------------------------

    public SeriesMotif (List motifs){
        this.motifs = motifs;
    }
}
