package Controller;

import bo.BoFactory;
import bo.custom.UsersBo;
import dao.util.BoType;
import dto.UsersDto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterFormController {
    public BorderPane pane;
    public TextField txtEmailReg;
    public TextField txtPasswordReg;
    public ChoiceBox txtJobRoleReg;
    private UsersBo usersBo = BoFactory.getInstance().getBo(BoType.USERS);

    public void btnLoginOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/LoginForm.fxml"))));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }


    public void btnRegisterOnAction(MouseEvent actionEvent) throws SQLException, ClassNotFoundException {
        String email = txtEmailReg.getText();
        String password = txtPasswordReg.getText();

        if (isValidEmail(email) ) {

            if (isValidPassword(password)){
                UsersDto dto = new UsersDto(email, password, txtJobRoleReg.getValue().toString());
                boolean isSaved = usersBo.saveUsers(dto);

                if (isSaved) {
                    new Alert(Alert.AlertType.INFORMATION, "User Registered!").show();
                }
            }else {
                new Alert(Alert.AlertType.ERROR, "Invalid  password!").show();
            }
        } else {
            new Alert(Alert.AlertType.ERROR, "Invalid email!").show();
        }
    }

    private boolean isValidEmail(String email) {
        String gmailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@gmail\\.com$";
        Pattern pattern = Pattern.compile(gmailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidPassword(String password) {
        // Password validation: at least 8 characters, upper case letters, and symbols
        String passwordRegex = "^(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }


    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> jobRoles = FXCollections.observableArrayList(
                "Owner",
                "Manager",
                "Employee"
        );
        txtJobRoleReg.setItems(jobRoles);
    }
}
