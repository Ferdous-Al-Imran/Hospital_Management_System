/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author username
 */
public class Test_info {
    private String no;
    private String test_name;
    private String patient_name;
    private String test_date;
    private String delivery_date;
    private String expenses;
    private String doctor_name;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getTest_date() {
        return test_date;
    }

    public void setTest_date(String test_date) {
        this.test_date = test_date;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public Test_info(String no, String test_name, String patient_name, String test_date, String delivery_date, String expenses, String doctor_name) {
        this.no = no;
        this.test_name = test_name;
        this.patient_name = patient_name;
        this.test_date = test_date;
        this.delivery_date = delivery_date;
        this.expenses = expenses;
        this.doctor_name = doctor_name;
    }

    public Test_info() {
    }
    
}
