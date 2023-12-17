package Utils.Motifs;

import Utils.Alea;

public class OrMotif<T> extends Motif
{
    // Alternatives motifs
    Motif[] motifs;

    Motif chosenMotif;


    @Override
    public void start() {
        chosenMotif = (Motif) Alea.oneOf(motifs);
        chosenMotif.start();
    }

    @Override
    public boolean hasNext() { return chosenMotif.hasNext();}

    @Override
    public void next() {
        if (chosenMotif.hasNext()) {
            chosenMotif.next();
        } ;
        currentValue = chosenMotif.currentValue;
    }

    public OrMotif(Motif[] motifs){
        this.motifs = motifs;
    }
}
