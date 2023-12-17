package Concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRangedValues<TypeValue, TypeRange extends TimedRange> extends RangedValues implements TimedRange{

    // A concrete class wich extends RangedValue, using ArrayList for the implementation

    public List<TypeValue> valueList;
    public List<TypeRange> rangeList;
    @Override
    public Object getValue(int i) {
        return valueList.get(i);
    }

    @Override
    public void setValue(int i, Object o) {
        valueList.add(i,(TypeValue) o);
    }

    @Override
    public void addValue(Object o) {
        valueList.add((TypeValue) o);
    }
    public TypeValue lastValue() {return valueList.get(valueList.size()-1);}

    @Override
    public TypeRange getRange(int i) {
        return rangeList.get(i);
    }

    @Override
    public void setRange(int i, TimedRange range) {
        rangeList.add(i, (TypeRange) range);
    }

    @Override
    public void addRange(TimedRange range) {
        rangeList.add((TypeRange) range);
    }
    public TimedRange lastRange(){return rangeList.get(rangeList.size()-1);}

    public  void concat(RangedValues rangedValues){

        for (int i = 0; i < rangedValues.size(); i++) {
            rangeList.add((TypeRange) rangedValues.getRange(i));
            valueList.add((TypeValue) rangedValues.getValue(i));}
    }

    // suppress the iem pair of (value rangedValue)
    public void suppress(int i){
        this.rangeList.remove(i);
        this.valueList.remove(i);
    }

    @Override
    public int size() {
        return rangeList.size();
    }

    public int length(){
        int length = 0;

        Iterator<TypeRange> iterator = rangeList.listIterator();
        while (iterator.hasNext()){
            length = length + iterator.next().intValue();}

        return length;
    }

    @Override
    public int intValue() {
        return length();
    }

    //-----------------------------------------------------------------------------------------------------
    //
    //  get a sub series between two bounds (lower include, upper exclude)
    @Override
    public RangedValues subseries(int lowerBound, int upperBound) {
        ListRangedValues result = new ListRangedValues();

        List<TypeRange> subListRange = new ArrayList<>();
        List<TypeValue> subListValue = new ArrayList<>();

        for (int i = 0; i < upperBound-lowerBound; i++) {
            subListValue.add(valueList.get(lowerBound+i));
            subListRange.add(rangeList.get(lowerBound+i));
        }

        result.rangeList = subListRange;
        result.valueList = subListValue;

        return result;
    }

    //--------------------------------------------------------------------------------------------------------

    public ListRangedValues(){
        valueList = new ArrayList<>();
        rangeList = new ArrayList<>();

    }


}
