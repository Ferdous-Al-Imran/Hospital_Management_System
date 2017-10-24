/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author username
 */
public class Login_pageController implements Initializable {
    @FXML
    private TextField user_name_textfield;
    @FXML
    private PasswordField password_passwordfield;
    @FXML
    private Button login_button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        HashMap<String,String> username_password=new HashMap<String,String>();
        username_password.put("admin", "admin");
        username_password.put("doctor", "doctor");
        username_password.put("nurse", "nurse");
        username_password.put("reception", "reception");
        //System.out.println(username_password.get("admin"));
        login_button.disableProperty().bind(Bindings.isEmpty(user_name_textfield.textProperty())
                            .or(Bindings.isEmpty(password_passwordfield.textProperty())));
                
    }    

    @FXML
    private void login_button_clicked(ActionEvent event) throws IOException {
        
        
        String username=user_name_textfield.getText();
        String password=password_passwordfield.getText();
        System.out.println("username : "+username+"  password is: "+password);
        
        if(username.equals("admin") && password.equals("admin")){
            System.out.println(password);
            Stage stage = (Stage) login_button.getScene().getWindow();
            stage.close();
            
            Parent root = FXMLLoader.load(getClass().getResource("/cms/admin_page.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else if(username.equals("doctor") && password.equals("doctor")){
            System.out.println(password);
            Stage stage = (Stage) login_button.getScene().getWindow();
            stage.close();
            
            Parent root = FXMLLoader.load(getClass().getResource("/doctor/doctor.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else if(username.equals("reception") && password.equals("reception")){
            System.out.println(password);
            Stage stage = (Stage) login_button.getScene().getWindow();
            stage.close();
            
            Parent root = FXMLLoader.load(getClass().getResource("/reception/reception.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else{
            //Stage stage = (Stage) login_button.getScene().getWindow();
            //stage.close();
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/error_handeling/wrong_username_password_error.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
    }
    
}
