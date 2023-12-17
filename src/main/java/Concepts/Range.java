package Concepts;

public class Range {

    int lowerBound;
    public int getLowerBound() {
        return lowerBound;}
    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;}


    int upperBound;

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public boolean contains(int date) {
        return ((lowerBound<= date) && (date <= upperBound));
    }

    public Range(int lower, int upper){
        lowerBound = lower;
        upperBound = upper;
    }

}
