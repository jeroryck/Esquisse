package com.esquisse.esquisse;

import format.MasterOfFiles;
import javafx.fxml.FXML;
import javafx.scene.chart.*;
import stairCase.StaircaseFunction;
import Sketch.PhraseA;
import stairCase.TimeSerie;

public class HelloController {


    @FXML
    private NumberAxis xAxis;

    @FXML
    private NumberAxis yAxis;
    @FXML
    public LineChart theLineChart;



    public void populateLineChart(TimeSerie<Integer> scf){
        // Create a data series
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Function view");

        // Populate the data serie. Each step is translated as 2 horizontal data series
        for (int i = 0; i < scf.getNumberOfSteps(); i++) {
            series.getData().add(new XYChart.Data<>(scf.stepRanges[i]+0.01,scf.heights[i]));
            series.getData().add(new XYChart.Data<>(scf.stepRanges[i+1],scf.heights[i]));
        }

        // Add the data series to the BarChart
        theLineChart.getData().add(series);

        series.getNode().setStyle("    -fx-stroke: blue;" +
                "    -fx-stroke-width: 2px;");
    }



    public void initialize() {

        theLineChart.setTitle("Pretty Curve");
       // TimeSerie<Integer> test = TimeSerie.testSerie();
        //populateLineChart(test);

        //TimeSerie<Integer> test1 = TimeSerie.testSerie();
        //test1.fuzzyfy(2);
        // populateLineChart(test1);


    }
}