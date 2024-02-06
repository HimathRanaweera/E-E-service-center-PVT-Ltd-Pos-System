package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {

    public Button categoryButton;
    public Button ItemsButton;
    public Button OrdersButton;
    public Button ReportsButton;
    public BorderPane Pane;

    public void categoryButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CategoryForm.fxml"))));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ItemsButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ItemsForm.fxml"))));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void OrdersButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashboardForm.fxml"))));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ReportsButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashboardForm.fxml"))));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
