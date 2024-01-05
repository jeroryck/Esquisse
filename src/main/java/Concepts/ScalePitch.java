package Concepts;

public class ScalePitch implements Sound, Movable{

    private int index;

    // The octave of the pitch (absolute value)
    private int octave;
    public int getOctave() {
        return octave;
    }
    public void setOctave(int octave) {
        this.octave = octave;
    }

    // The degree of the pitch in the scale
    private int degre;
    public int getDegre() {
        return degre;
    }

    public void setDegre(int degre) {
        this.degre = degre;
    }





    //-----------------------------------------------------------------------------------------------------------------


    @Override
    public Movable succ() {
        return null;
    }

    @Override
    public Movable pred() {
        return null;
    }

    //-------------------------------------------------------------------------------------------------------------------

    @Override
    public String asString() {
        return null;
    }

    @Override
    public Sound silentValue() {
        return null;
    }

    @Override
    public Sound transpose(int decal) {
        return null;
    }

    @Override
    public Sound makeLowerThan(int indexPitch) {
        return null;
    }

    @Override
    public Sound makeGreaterThan(int indexPitch) {
        return null;
    }

    @Override
    public Boolean lowerThan(int indexPitch) {
        return null;
    }

    @Override
    public Boolean greaterThan(int indexPitch) {
        return null;
    }
}
