/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

/**
 *
 * @author username
 */
public class Doctor_info {
    private String no;
    private String doctorName;
    private String age;
    private String sex;
    private String department;
    private String designation;
    private String address;
    private String salary;    
    private String date_of_birth;
    private String mobile_no;
    private String appointment_fee;
    private String room_no;
    private String working_state;

    public Doctor_info(String no, String doctorName, String age, String sex, String department, String designation, String address, String salary, String date_of_birth, String mobile_no, String appointment_fee, String room_no, String working_state) {
        this.no = no;
        this.doctorName = doctorName;
        this.age = age;
        this.sex = sex;
        this.department = department;
        this.designation = designation;
        this.address = address;
        this.salary = salary;
        this.date_of_birth = date_of_birth;
        this.mobile_no = mobile_no;
        this.appointment_fee = appointment_fee;
        this.room_no = room_no;
        this.working_state = working_state;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
        public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getAppointment_fee() {
        return appointment_fee;
    }

    public void setAppointment_fee(String appointment_fee) {
        this.appointment_fee = appointment_fee;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public String getWorking_state() {
        return working_state;
    }

    public void setWorking_state(String working_state) {
        this.working_state = working_state;
    }

    public Doctor_info() {
    }
    
}
