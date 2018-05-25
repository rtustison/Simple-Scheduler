import java.net.URL;
import java.util.*;

import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.fxml.Initializable;

public class GraphController implements Initializable{
	@FXML
    private LineChart<?, ?> LineChart;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//how to add data to chart
		//create a new series object for every new line in the chart
		XYChart.Series series = new XYChart.Series();
		//add new XYChart data (x,y)
		//x has to be a string for some reason
		series.getData().add(new XYChart.Data("1",0));
		series.getData().add(new XYChart.Data("2",5));
		series.getData().add(new XYChart.Data("3",12));
		series.getData().add(new XYChart.Data("4",21));
		series.getData().add(new XYChart.Data("5",37));
		series.getData().add(new XYChart.Data("6",49));
		//add all the points to the chart
		LineChart.getData().addAll(series);
	}

}
