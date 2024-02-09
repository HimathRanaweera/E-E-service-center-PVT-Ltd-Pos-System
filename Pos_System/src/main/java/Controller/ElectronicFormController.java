package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ElectronicFormController {
    public BorderPane Pane;
    public Button BackButton;

    public void BackButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CategoryForm.fxml"))));
            stage.setTitle("CategoryForm");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imgLogoButton(MouseEvent mouseEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashboardForm.fxml"))));
            stage.setTitle("DashboardForm");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imgUserButton(MouseEvent mouseEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/UserForm.fxml"))));
            stage.setTitle("CategoryForm");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
