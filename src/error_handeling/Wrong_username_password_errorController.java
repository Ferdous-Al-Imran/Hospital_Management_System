/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error_handeling;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author username
 */
public class Wrong_username_password_errorController implements Initializable {
    @FXML
    private Button error_button;

    public Button getError_button() {
        return error_button;
    }

    public void setError_button(Button error_button) {
        this.error_button = error_button;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
