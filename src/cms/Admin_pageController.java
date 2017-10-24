/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

import doctor.Doctor_info;
import database.Clinic_database;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import patient.Patient_info;
import tests.Test_info;

/**
 * FXML Controller class
 *
 * @author username
 */
public class Admin_pageController implements Initializable {
    
    @FXML
    private TableColumn<Patient_info, String> patient_list_patient_name_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_age_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_sex_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_blood_group;
    @FXML
    private TableColumn<Patient_info, String> patient_list_marital_status;
    @FXML
    private TableColumn<Patient_info, String> patient_list_weight_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_height_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_bmi_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_address_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_birth_date_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_mobile_no_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_occupation_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_ward_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_admit_date_col;
    @FXML
    private TableColumn<Patient_info, String> patient_list_release_date_col;
    @FXML
    private TableView<Patient_info> patient_list_table;
    
    //declarations for doctors list table
    @FXML
    private TableView<Doctor_info> doctor_list_table;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_no_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_doctor_name_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_doctor_sex_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_doctor_age_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_department_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_designation_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_address_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_dob_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_mob_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_appointment_fee_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_room_no_col;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_working_state;
    @FXML
    private TableColumn<Doctor_info, String> doctor_list_salary_col;
    @FXML
    private TextField new_doctor_name;
    @FXML
    private TextField new_doctor_age;
    @FXML
    private DatePicker new_doctor_date_of_birth;
    @FXML
    private TextField new_doctor_designation;
    @FXML
    private TextArea new_doctor_address;
    @FXML
    private TextField new_doctor_mob_no;
    @FXML
    private TextField new_doctor_salary;
    @FXML
    private TextArea new_doctor_education;
    @FXML
    private TextField new_doctor_room_no;
    @FXML
    private TextField new_doctor_appointment_fee;
    @FXML
    private Button new_doctor_save_button;
    @FXML
    private TextField new_doctor_sex;
    @FXML
    private TextField new_doctor_department;
    @FXML
    private TextField search_patient_name_textbox;
    @FXML
    private Button search_patient_button_id;
    @FXML
    private TextField search_patient_test_name;
    @FXML
    private TextField search_patient_doctor_name;
    @FXML
    private TextField test_test_name;
    @FXML
    private TextField test_patient_name;
    @FXML
    private DatePicker test_test_date;
    @FXML
    private DatePicker test_delivery_date;
    @FXML
    private TextField test_doctor_name;
    @FXML
    private Button test_search_button;
    @FXML
    private TableView<Test_info> todays_test_table;
    @FXML
    private TableColumn<Test_info,String> test_no_col;
    @FXML
    private TableColumn<Test_info,String> test_name_col;
    @FXML
    private TableColumn<Test_info,String> test_patient_name_col;
    @FXML
    private TableColumn<Test_info,String> test_date_col;
    @FXML
    private TableColumn<Test_info,String> test_delivery_date_col;
    @FXML
    private TableColumn<Test_info,String> test_expense_col;
    @FXML
    private TableColumn<Test_info, String> test_doctor_name_col;
    @FXML
    private TextField search_doctor_name_textbox;
    @FXML
    private Button search_doctor_button;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // getting the instance of the clinic_database class
        Clinic_database clinic_database=Clinic_database.getClinic_database();
        clinic_database.connect_database();
        
//        ObservableList<Patient_info> temp=FXCollections.observableArrayList();
//        Patient_info pi=new Patient_info("paul walik", "addds", "dasd", "dad", "nnnn", "mmm", null, null, null, null, null, null, null, null, null);
//        temp.addAll(pi);
//        patient_list_table.setItems(temp);
        // start connecting the patient table with the collumns
        patient_list_patient_name_col.setCellValueFactory(new PropertyValueFactory<>("patient_name"));
        patient_list_age_col.setCellValueFactory(new PropertyValueFactory<>("age"));
        patient_list_sex_col.setCellValueFactory(new PropertyValueFactory<>("sex"));
        patient_list_blood_group.setCellValueFactory(new PropertyValueFactory<>("blood_group"));
        patient_list_marital_status.setCellValueFactory(new PropertyValueFactory<>("marital_status"));
        patient_list_weight_col.setCellValueFactory(new PropertyValueFactory<>("weight"));
        patient_list_height_col.setCellValueFactory(new PropertyValueFactory<>("height"));
        patient_list_bmi_col.setCellValueFactory(new PropertyValueFactory<>("bmi"));
        patient_list_address_col.setCellValueFactory(new PropertyValueFactory<>("address"));
        patient_list_birth_date_col.setCellValueFactory(new PropertyValueFactory<>("birth_date"));
        patient_list_mobile_no_col.setCellValueFactory(new PropertyValueFactory<>("mobile_no"));
        patient_list_occupation_col.setCellValueFactory(new PropertyValueFactory<>("occupation"));
        patient_list_ward_col.setCellValueFactory(new PropertyValueFactory<>("ward_no"));
        patient_list_admit_date_col.setCellValueFactory(new PropertyValueFactory<>("admit_date"));
        patient_list_release_date_col.setCellValueFactory(new PropertyValueFactory<>("release_date"));
        
        patient_list_table.setItems(clinic_database.get_Patient_info("SELECT * FROM PATIENT"));
        
        // end  connecting the patient table with the collumns

        
        doctor_list_no_col.setCellValueFactory(new PropertyValueFactory<>("no"));
        doctor_list_doctor_name_col.setCellValueFactory(new PropertyValueFactory<>("doctorName"));
        doctor_list_doctor_sex_col.setCellValueFactory(new PropertyValueFactory<>("sex"));
        doctor_list_doctor_age_col.setCellValueFactory(new PropertyValueFactory<>("age"));
        doctor_list_department_col.setCellValueFactory(new PropertyValueFactory<>("department"));
        doctor_list_designation_col.setCellValueFactory(new PropertyValueFactory<>("designation"));
        doctor_list_address_col.setCellValueFactory(new PropertyValueFactory<>("address"));
        doctor_list_salary_col.setCellValueFactory(new PropertyValueFactory<>("salary"));
        doctor_list_dob_col.setCellValueFactory(new PropertyValueFactory<>("date_of_birth"));
        doctor_list_mob_col.setCellValueFactory(new PropertyValueFactory<>("mobile_no"));
        doctor_list_appointment_fee_col.setCellValueFactory(new PropertyValueFactory<>("appointment_fee"));
        doctor_list_room_no_col.setCellValueFactory(new PropertyValueFactory<>("room_no"));
        doctor_list_working_state.setCellValueFactory(new PropertyValueFactory<>("working_state"));
     
        ObservableList<Doctor_info> temp=FXCollections.observableArrayList();
        Doctor_info pi=new Doctor_info("aaa", "fndfnv", "sds",null ,null, null, null, null, null, null, null, null, null);
        temp.addAll(pi);
        //doctor_list_table.setItems(temp);

        
        doctor_list_table.setItems(clinic_database.get_Doctor_info("SELECT * FROM DOCTOR"));
        
        //start connecting test table
        test_no_col.setCellValueFactory(new PropertyValueFactory<>("no"));
        test_name_col.setCellValueFactory(new PropertyValueFactory<>("test_name"));
        test_patient_name_col.setCellValueFactory(new PropertyValueFactory<>("patient_name"));
        test_date_col.setCellValueFactory(new PropertyValueFactory<>("test_date"));
        test_delivery_date_col.setCellValueFactory(new PropertyValueFactory<>("delivery_date"));
        test_expense_col.setCellValueFactory(new PropertyValueFactory<>("expenses"));
        test_doctor_name_col.setCellValueFactory(new PropertyValueFactory<>("doctor_name"));
        
        String test_query="SELECT TEST.testId, TEST.testName, PATIENT.patientName, TEST.testDate, "+
                "TEST.deliveryDate, TEST.expenses, DOCTOR.doctorName" +
    "FROM PATIENT JOIN TEST ON (PATIENT.patientId=TEST.patientId)" +
"JOIN DOCTOR ON (DOCTOR.doctorId=TEST.doctorId);";
        
        //todays_test_table.setItems(clinic_database.get_test_info(test_query));
        //end connecting test table
        ObservableList<Test_info> temp2=FXCollections.observableArrayList();
        Test_info pi2=new Test_info("1", "ag+", "ANIK", "12/25/15", "12/12/12", "1200", "ANIK");
        Test_info pi3=new Test_info("2", "URINE", "SHAD", "12/11/15", "12/12/12", "1255", "SHAMAN");
        Test_info pi4=new Test_info("3", "BLOOD", "NAZRUL", "12/15/15", "12/12/12", "sss", "SADIK");
        Test_info pi5=new Test_info("4", "AAA", "SHAM", "12/12/12", "14/15/12", "1250", "SHIMUL");
        Test_info pi6=new Test_info("5", "BBB", "JOD", "12/12/12", "12/12/55", "1220", "AJMAN");
        Test_info pi7=new Test_info("6", "CCC", "JACK", "12/12/12", "11/11/22", "100", "ANIK");
        Test_info pi8=new Test_info("7", "asas", "SUP", "12/12/12", "12/24/12", "200", "SHADMAN");
        Test_info pi9=new Test_info("8", "asas", "DUP", "12/12/12", "12/05/22", "1200", "TANMOY");
        Test_info pi10=new Test_info("9", "asas", "assa", "12/12/12", "11/12/12", "1000", "TONMOY");
        
        temp2.addAll(pi2,pi3,pi4,pi5,pi6,pi7,pi8,pi9,pi10);
        todays_test_table.setItems(temp2);

        
        clinic_database.close_database();
        
        
    }    

    @FXML
    private void new_doctor_save_button(ActionEvent event) {
        String address=new_doctor_address.getText();
        String age=new_doctor_age.getText();
        String appointment_fee=new_doctor_appointment_fee.getText();
        LocalDate date_of_birth=new_doctor_date_of_birth.getValue();
        String department=new_doctor_department.getText();
        String designation=new_doctor_designation.getText();
        String education=new_doctor_education.getText();
        String mobileno=new_doctor_mob_no.getText();
        String name=new_doctor_name.getText();
        String roomNo=new_doctor_room_no.getText();
        String salary=new_doctor_salary.getText();
        String sex=new_doctor_sex.getText();
        
        String query="INSERT INTO `CLINIC_DATABASE`.`DOCTOR` (`doctorId`, `doctorName`,"
                        +" `age`, `sex`, `department`, `designation`, `address`, `salary`,"
                        +" `roomNo`, `date_of_birth`, `mobile_no`, `appointment_fee`, "
                        +"`working_state`) VALUES (NULL, '"
                        +name+"', '"+age+"', '"+sex+"', '"+department+"',"
                        +" '"+designation+"', '"+address+"', '"+salary+"', '"+roomNo+"', '"+date_of_birth+"',"
                        +" '"+mobileno+"', '"+appointment_fee+"', '"+"true"+"');";
        Clinic_database clinic_database=Clinic_database.getClinic_database();
        clinic_database.connect_database();
        
        clinic_database.update(query);
        
        clinic_database.close_database();
    }

    @FXML
    private void search_patient_button_clicked(ActionEvent event) {
        String patient_name=search_patient_name_textbox.getText();
        String test_name=search_patient_test_name.getText();
        String doctor_name=search_patient_doctor_name.getText();
        String query="";
        //all is null   000
        if(search_patient_name_textbox.getText().equals("")){
            query="SELECT * FROM PATIENT"; 
        }
        else{
            query="SELECT * FROM PATIENT where patientName like '"+patient_name+"';";
        }
        
//        //only doctor
//        if(search_patient_test_name.getText().equals("") && search_patient_name_textbox.getText().equals("") && !search_patient_doctor_name.getText().equals("")){
//            query="SELECT PATIENT.patientId, PATIENT.patientName, PATIENT.age, PATIENT.sex, PATIENT.bloodGroup,"+
//                    " PATIENT.maritalStatus, PATIENT.weight, PATIENT.height, PATIENT.bodyMassIndex, "+
//                    "PATIENT.address, PATIENT.birthDate, PATIENT.mobileNo, PATIENT.occupation,"+
//                                        " PATIENT.wardNo, PATIENT.admitDate, PATIENT.releaseDate" +
//                    "FROM PATIENT JOIN PATIENT_DOCTOR pd ON (PATIENT.patientId=pd.patientId)" +
//                    "JOIN DOCTOR d ON (d.doctorId=pd.doctorId)" +
//                    "WHERE d.doctorName like'"+doctor_name+"';";
//                            }
//        
        // all is given 111
        if(!search_patient_test_name.getText().equals("") && !search_patient_name_textbox.getText().equals("") && !search_patient_doctor_name.getText().equals("")){
            query="SELECT PATIENT.patientId, PATIENT.patientName, PATIENT.age, PATIENT.sex, PATIENT.bloodGroup, PATIENT.maritalStatus, PATIENT.weight, PATIENT.height, PATIENT.bodyMassIndex, PATIENT.address, PATIENT.birthDate, PATIENT.mobileNo, PATIENT.occupation, PATIENT.wardNo, PATIENT.admitDate, PATIENT.releaseDate\n" +
"FROM PATIENT JOIN TEST t ON (PATIENT.patientId=t.patientId)" +
"JOIN DOCTOR d ON (d.doctorId=t.doctorId)" +
"WHERE PATIENT.patientName= '"+patient_name+"' AND d.doctorName='"+doctor_name+"' AND t.testName='"+test_name+"';";
        }
        
//        
//        //all is given
//        if(!search_patient_test_name.getText().equals("") && !search_patient_name_textbox.getText().equals("") && !search_patient_doctor_name.getText().equals("")){
//            query="SELECT PATIENT.patientName, PATIENT.age, PATIENT.sex, PATIENT.bloodGroup, "+
//                    "PATIENT.maritalStatus, PATIENT.weight, PATIENT.height, PATIENT.bodyMassIndex,"+
//                    " PATIENT.address, PATIENT.birthDate, PATIENT.mobileNo, PATIENT.occupation,"+
//                    " PATIENT.wardNo, PATIENT.admitDate, PATIENT.releaseDate FROM PATIENT JOIN TEST "+
//                    " t ON (PATIENT.patientId=t.patientId) JOIN DOCTOR d ON (d.doctorId=t.doctorId) "+
//                    "WHERE PATIENT.patientName like '"+patient_name+"' AND d.doctorName "+
//                    "like'"+doctor_name+"' AND t.testName like'"+test_name+"';"; 
//
//        }
//        
        
        
        
//        if(!search_patient_name_textbox.getText().equals("")){
//            patient_name=search_patient_name_textbox.getText();
//        }
//        if(!search_patient_doctor_name.getText().equals("")){
//            doctor_name=search_patient_doctor_name.getText();
//        }
        
        //String query="SELECT PATIENT.patientName, PATIENT.age, PATIENT.sex, PATIENT.bloodGroup, PATIENT.maritalStatus, PATIENT.weight, PATIENT.height, PATIENT.bodyMassIndex, PATIENT.address, PATIENT.birthDate, PATIENT.mobileNo, PATIENT.occupation, PATIENT.wardNo, PATIENT.admitDate, PATIENT.releaseDate FROM PATIENT JOIN TEST t ON (PATIENT.patientId=t.patientId) JOIN DOCTOR d ON (d.doctorId=t.doctorId) WHERE PATIENT.patientName like '"+patient_name+"' AND d.doctorName like'"+doctor_name+"' AND t.testName like'AG+';";
        Clinic_database clinic_database=Clinic_database.getClinic_database();
        clinic_database.connect_database();
        
        
        patient_list_table.setItems(clinic_database.get_Patient_info(query));
        clinic_database.close_database();
        
    }

    @FXML
    private void test_search_button_clicked(ActionEvent event) {
        
    }

    @FXML
    private void search_doctor_button_clicked(ActionEvent event) {
        String query ="SELECT * FROM DOCTOR";
        query = "SELECT * FROM DOCTOR where doctorName like '"+search_doctor_name_textbox.getText()+"';";
        Clinic_database clinic_database=Clinic_database.getClinic_database();
        clinic_database.connect_database();
        
        
        doctor_list_table.setItems(clinic_database.get_Doctor_info(query));
        clinic_database.close_database();
    }
    
}













