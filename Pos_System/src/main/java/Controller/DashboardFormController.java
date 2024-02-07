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
            stage.setTitle("CategoryForm");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void OrdersButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrdersForm.fxml"))));
            stage.show();
            stage.setTitle("OrdersForm");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ReportsButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) Pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ReportsForm.fxml"))));
            stage.show();
            stage.setTitle("ReportsForm");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
