/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import doctor.Doctor_info;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import patient.Patient_info;
import tests.Test_info;

/**
 *
 * @author username
 */
public class Clinic_database {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    
    
    
    //creating a private object of the class 
    private static Clinic_database clinic_database=new Clinic_database();
    //making the constructor private so that the class can not be instantiated
    private Clinic_database(){
        
    }
    
    //get function for getting the only object available
    public static Clinic_database getClinic_database(){
        return clinic_database;
    }
    
    
    public void connect_database(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/CLINIC_DATABASE?zeroDateTimeBehavior=convertToNull","root","s");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("database connected");
    }
    
    public void close_database(){
        
            try
            {
                if(resultSet!=null){
                    resultSet.close();
                }
                if(statement!=null){
                    statement.close();
                }
                if(connection!=null){
                    connection.close();
                }
                
                System.out.println("database closed");
            } 
            catch ( Exception exception )
            {
                exception.printStackTrace();
            } 
    }
    public void insert_in_database(String query){
        try{
            resultSet=statement.executeQuery(query);
            metaData=resultSet.getMetaData();
           
        }
        catch(Exception e){
            
        }
        
        
    }
    
    public void update(String sql){
        try{
            statement.executeUpdate(sql);
            System.out.println("inside update");
        } catch(SQLException ex){
            //Logger.getLogger(sql)
        }
    }
    
    public ObservableList<Patient_info> get_Patient_info(String sql){
            ObservableList<Patient_info> row = FXCollections.observableArrayList();
            try {
            resultSet = statement.executeQuery(sql);
            metaData = resultSet.getMetaData();
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString("PATIENT.patientName"));
                Patient_info ob = new Patient_info(
                        resultSet.getString("PATIENT.patientName"),
                        resultSet.getString("PATIENT.age"),
                        resultSet.getString("PATIENT.sex"),
                        resultSet.getString("PATIENT.bloodGroup"),
                        resultSet.getString("PATIENT.maritalStatus"),
                        resultSet.getString("PATIENT.weight"),
                        resultSet.getString("PATIENT.height"),
                        resultSet.getString("PATIENT.bodyMassIndex"),
                        resultSet.getString("PATIENT.address"),
                        resultSet.getString("PATIENT.birthDate"),
                        resultSet.getString("PATIENT.mobileNo"),
                        resultSet.getString("PATIENT.occupation"),
                        resultSet.getString("PATIENT.wardNo"),
                        resultSet.getString("PATIENT.admitDate"),
                        resultSet.getString("PATIENT.releaseDate")
                );
                
                row.addAll(ob);

            }
        } catch (Exception e) {

        }

        return row;    
    }
    
    public ObservableList<Doctor_info> get_Doctor_info(String sql){
        System.out.println("inside the error");
            ObservableList<Doctor_info> row = FXCollections.observableArrayList();
            try {
            resultSet = statement.executeQuery(sql);
            metaData = resultSet.getMetaData();
            System.out.println("inside the error 2");
            while (resultSet.next()) {
                System.out.println("inside the error 3");
                //Doctor_info ob = new Doctor_info("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l");
                Doctor_info ob = new Doctor_info(
                        resultSet.getString("doctorId"),
                        resultSet.getString("doctorName"), 
                        resultSet.getString("age"), 
                        resultSet.getString("sex"),
                        resultSet.getString("department"),
                        resultSet.getString("designation"),
                        resultSet.getString("address"),
                        resultSet.getString("salary"), 
                        resultSet.getString("date_of_birth"), 
                        resultSet.getString("mobile_no"), 
                        resultSet.getString("appointment_fee"), 
                        resultSet.getString("roomNo"), 
                        resultSet.getString("working_state")
                );
                int i=0;
                System.out.println("inside the error: "+i++);
                
                row.addAll(ob);

            }
        } catch (Exception e) {

        }

        return row;    
    }
    
    
    public ObservableList<Test_info> get_test_info(String sql){
            ObservableList<Test_info> row = FXCollections.observableArrayList();
            try {
            resultSet = statement.executeQuery(sql);
            metaData = resultSet.getMetaData();
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            while (resultSet.next()) {
                System.out.println("patient name is "+resultSet.getString("patientName"));
                Test_info ob=new Test_info(
                                        resultSet.getString("testId"),
                                        resultSet.getString("testName"),
                                        resultSet.getString("patientName"),
                                        resultSet.getString("testDate"), 
                                        resultSet.getString("deliveryDate"),  
                                        resultSet.getString("expenses"), 
                                        resultSet.getString("doctorName")
                                        
                );
                row.addAll(ob);
            }
        } catch (Exception e) {

        }

        return row;    
    }
    
}
