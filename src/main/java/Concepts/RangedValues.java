package Concepts;

//  A abstract class for series of value tagged by objects which have a length
// The series has the same number of values and range (this is different from the TimeSeries)

public abstract class RangedValues <TypeValue, TypeRange extends TimedRange> {

    // get a value at a given place
    public abstract TypeValue getValue(int i);

    // Set a value at a given place
    public abstract void setValue(int i, TypeValue value);

    // Add a value at the end
    public abstract void addValue(TypeValue value);


    public abstract TypeRange getRange(int i);

    // Set a range at a given place
    public abstract void setRange(int i, TypeRange range);

    // Add a range at the end
    public abstract void addRange(TypeRange range);

    // Concat at the end
    public abstract void concat(RangedValues rangedValues);

    // The size of the series, i.e the number of values (or range)
    public abstract int size();

    //-----------------------------------------------------------------------------------------------------
    //
    //

    // length of the series
    public abstract int length();

    //  get a sub series between two bounds (lower include, upper exclude)
    public abstract RangedValues subseries(int lowerBound, int upperBound);

}

