package Components.SeriesGenerator;

import Concepts.ListRangedValues;
import Concepts.RangedValues;
import Concepts.TimedRange;
import Utils.Alea;

import java.util.List;

public abstract  class SelfReplicator<TypeValue,TypeRange extends TimedRange> {

    public abstract TypeValue generateValue();

    public abstract TypeRange generateDuration();

    // Each "cycleSize", the series is replicated, but a "innovRate" of elements are innovations.
    public int cycleSize;

    // innovRate should be smaller than cycleSize
    public int innovRate;

    public  RangedValues<TypeValue, TypeRange>  generate( int totalDuration){

        RangedValues<TypeValue,TypeRange> newSeries = new ListRangedValues<TypeValue,TypeRange>();

        // First cycle (to initiate the process of replication)
        for (int i = 0; i < cycleSize ; i++) {
            newSeries.addValue(generateValue());
            TypeRange newRange = generateDuration();
            newSeries.addRange(newRange );
        }

        // Next cycles
        while (newSeries.length() <= totalDuration){

            // Create a new cycle
            List<Integer> positionOfInnovation = Alea.nAmongM(innovRate,cycleSize);
            // -> Copy the previous cycle
            RangedValues newCycle = newSeries.subseries(newSeries.size()-cycleSize,newSeries.size());
            // -> and modify it with the innovation
            for (int i = 0; i < positionOfInnovation.size(); i++) {
                TypeValue newValue = generateValue();
                newCycle.setValue(positionOfInnovation.get(i),newValue);
            }
            newSeries.concat(newCycle);
        }

       return newSeries;
    }

    //------------------------------------------------------------------------------------------------------------

    public SelfReplicator(int cycleSize, int innovRate){
        this.cycleSize = cycleSize;
        this.innovRate = innovRate;
    };

}
