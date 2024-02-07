package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CategoryFormController {
    public BorderPane Pane;
    public Button ElectronicButton;
    public Button ElectricalButton;
    public Button BackButton;

    public void ElectronicButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ElectronicForm.fxml"))));
            stage.show();
            stage.setTitle("ElectronicForm");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ElectricalButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ElectricalForm.fxml"))));
            stage.show();
            stage.setTitle("ElectricalForm");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void BackButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashboardForm.fxml"))));
            stage.show();
            stage.setTitle("DashboardForm");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
