package Concepts;

public interface Sound {

    public String asString();
    public Sound silentValue();

    public Sound transpose(int decal);

    // adjustment function if the sound is too high  or too low
    public Sound makeLowerThan(int indexPitch);
    public Sound makeGreaterThan(int indexPitch);

    public Boolean lowerThan(int indexPitch);
    public Boolean greaterThan(int indexPitch);

}
