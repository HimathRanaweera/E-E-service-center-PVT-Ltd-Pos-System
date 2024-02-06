package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class loginFormController {
    public Button loginButton;
    public BorderPane pane;
    public TextField userNameTextField;
    public PasswordField userNamePasswordTextField;

    public void loginButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashboardForm.fxml"))));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void userNameTextFieldOnAction(ActionEvent actionEvent) {

    }

    public void userNamePasswordTextFieldOnAction(ActionEvent actionEvent) {

    }
}
