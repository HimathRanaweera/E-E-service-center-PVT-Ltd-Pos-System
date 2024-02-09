package Controller;

import bo.BoFactory;
import bo.custom.UsersBo;
import dao.util.BoType;
import dto.UsersDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class loginFormController {
    public Button loginButton;
    public BorderPane pane;
    public TextField userNameTextField;
    public PasswordField userNamePasswordTextField;
    public Label Register;
    private UsersBo usersBo = BoFactory.getInstance().getBo(BoType.USERS);


    public void loginButtonOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        List<UsersDto> dtoList  = usersBo.allUsers();
        for (UsersDto dto:dtoList) {

            if(dto.getEmail().equals(userNameTextField.getText())){
                if (dto.getPassword().equals(userNamePasswordTextField.getText())) {
                    Stage stage = (Stage) pane.getScene().getWindow();
                    try {
                        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashboardForm.fxml"))));

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    stage.setTitle("DashBoard Form");
                    stage.show();
                }
            }
        }

    }



    public void userNameTextFieldOnAction(ActionEvent actionEvent) {

    }

    public void userNamePasswordTextFieldOnAction(ActionEvent actionEvent) {

    }

    public void lblRegisterButton(MouseEvent mouseEvent) {
        Stage stage = (Stage) pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/RegisterForm.fxml"))));
            stage.show();
            stage.setTitle("RegisterForm");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
