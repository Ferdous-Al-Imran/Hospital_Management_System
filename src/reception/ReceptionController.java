/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reception;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author username
 */
public class ReceptionController implements Initializable {
    @FXML
    private TableView<?> patient_list_table;
    @FXML
    private TableColumn<?, ?> patient_list_patient_name_col;
    @FXML
    private TableColumn<?, ?> patient_list_age_col;
    @FXML
    private TableColumn<?, ?> patient_list_sex_col;
    @FXML
    private TableColumn<?, ?> patient_list_blood_group;
    @FXML
    private TableColumn<?, ?> patient_list_marital_status;
    @FXML
    private TableColumn<?, ?> patient_list_weight_col;
    @FXML
    private TableColumn<?, ?> patient_list_height_col;
    @FXML
    private TableColumn<?, ?> patient_list_bmi_col;
    @FXML
    private TableColumn<?, ?> patient_list_address_col;
    @FXML
    private TableColumn<?, ?> patient_list_birth_date_col;
    @FXML
    private TableColumn<?, ?> patient_list_mobile_no_col;
    @FXML
    private TableColumn<?, ?> patient_list_occupation_col;
    @FXML
    private TableColumn<?, ?> patient_list_ward_col;
    @FXML
    private TableColumn<?, ?> patient_list_admit_date_col;
    @FXML
    private TableColumn<?, ?> patient_list_release_date_col;
    @FXML
    private TableView<?> doctor_list_table;
    @FXML
    private TableColumn<?, ?> doctor_list_no_col;
    @FXML
    private TableColumn<?, ?> doctor_list_doctor_name_col;
    @FXML
    private TableColumn<?, ?> doctor_list_doctor_sex_col;
    @FXML
    private TableColumn<?, ?> doctor_list_doctor_age_col;
    @FXML
    private TableColumn<?, ?> doctor_list_department_col;
    @FXML
    private TableColumn<?, ?> doctor_list_designation_col;
    @FXML
    private TableColumn<?, ?> doctor_list_address_col;
    @FXML
    private TableColumn<?, ?> doctor_list_dob_col;
    @FXML
    private TableColumn<?, ?> doctor_list_mob_col;
    @FXML
    private TableColumn<?, ?> doctor_list_appointment_fee_col;
    @FXML
    private TableColumn<?, ?> doctor_list_room_no_col;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
