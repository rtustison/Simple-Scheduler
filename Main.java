import java.time.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {  

	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		//load login page
		Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
		primaryStage.setTitle("Simple Scheduler");
		primaryStage.setScene(new Scene(root));
		
		//show page
		primaryStage.show();
		
		//center window in the center of the screen
		Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2); 
        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 4);
	}
}
