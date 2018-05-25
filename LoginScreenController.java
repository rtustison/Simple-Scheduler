
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class LoginScreenController implements Initializable {

	@FXML
	private TextField username;

	@FXML
	private PasswordField password;

	@FXML
	private Button login;

	@FXML
	private void handleButtonAction(ActionEvent e) throws IOException {
		//load EnterTasks page and change scenes
		Parent homepage = FXMLLoader.load(getClass().getResource("EnterTasks.fxml"));
		Scene homepageScene = new Scene(homepage);
		Stage stage = (Stage) (((Node) e.getSource()).getScene().getWindow());
		stage.setScene(homepageScene);
		stage.show();
		//center in the middle of the page
		Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
		stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
		stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 4);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}
