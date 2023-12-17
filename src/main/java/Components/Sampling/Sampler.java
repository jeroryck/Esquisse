package Components.Sampling;

import stairCase.TimeSerie;
import stairCase.TimeSuite;

import java.util.ArrayList;
import java.util.List;

public class Sampler<T> {

    // the sampling is done if the point of sampling is in the stepRange of the serie
    // else nothing is done and the point is discarded
    // last point of sampling has no associated value, but is use to complete the last step
    public TimeSerie<T> sample(TimeSerie<T> timeSerie, TimeSuite samplingPoints) {

        Integer[] whishedPoints;
        whishedPoints = samplingPoints.dates;

        List<T> samples = new ArrayList<>();
        List<Integer> effectivePoints = new ArrayList<>();

        int currentIndex = 0;
        // Skipping the sampling points to small
        while (whishedPoints[currentIndex] < timeSerie.getMinTime()) {
            currentIndex++;
        }
        // Some stuff to do now
        while ((currentIndex < whishedPoints.length - 1) && (whishedPoints[currentIndex] <= timeSerie.getMaxTime())) {
            samples.add(timeSerie.getValue(whishedPoints[currentIndex]));
            effectivePoints.add(whishedPoints[currentIndex]);
            currentIndex++;
        }

        // we add the last point
        if (whishedPoints[currentIndex] >= timeSerie.getMaxTime())
            effectivePoints.add(timeSerie.getMaxTime());
        else
            effectivePoints.add(whishedPoints[currentIndex]);

        return timeSerie.buildFromList(effectivePoints, samples);
    }

    //-------------------------------------------------------------------------------------------------------------

    public Sampler() {
    }
}