package app.GUI.Login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController{
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    //private Button signinButton;
    private Button switchToSignup;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private Button signupButton;

    private Stage stage;
    public void signinButton(ActionEvent e){
        loginMessageLabel.setText("Trataste de loguearte!!");
        /*System.out.println("Email: " + emailField.getText() + " Password: " + passwordField.getText());
        String email = emailField.getText();
        boolean isValido = EmailValidator.validEmail(email);
        if (isValido) {
            System.out.println(email + " es un correo válido.");
        } else {
            System.out.println(email + " no es un correo válido.");
        }*/
    }
    public void signupButton(ActionEvent e){
        System.out.println("Presiono el boton Sign up, quiere registrarse!");
    }
    /*@Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        switchToSignup.setOnAction(event -> switchScene());
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    private void switchScene() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/GUI/Login/SignUp.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public void switchToSignup(){
        Parent root = FXMLLoader.load(getClass().getResource("/app/GUI/Login/SignUp.fxml"));
    }

}