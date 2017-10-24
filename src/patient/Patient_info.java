
package patient;

/**
 *
 * @author username
 */
public class Patient_info {
    private String no;
    private String patient_name;
    private String age;
    private String sex;
    private String blood_group;
    private String marital_status;
    private String weight;
    private String height;
    private String bmi;
    private String address;
    private String birth_date;
    private String mobile_no;
    private String occupation;
    private String ward_no;
    private String admit_date;
    private String release_date;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
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

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getWard_no() {
        return ward_no;
    }

    public void setWard_no(String ward_no) {
        this.ward_no = ward_no;
    }

    public String getAdmit_date() {
        return admit_date;
    }

    public void setAdmit_date(String admit_date) {
        this.admit_date = admit_date;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public Patient_info(String patient_name, String age, String sex, String blood_group, String marital_status, String weight, String height, String bmi, String address, String birth_date, String mobile_no, String occupation, String ward_no, String admit_date, String release_date) {
        this.patient_name = patient_name;
        this.age = age;
        this.sex = sex;
        this.blood_group = blood_group;
        this.marital_status = marital_status;
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
        this.address = address;
        this.birth_date = birth_date;
        this.mobile_no = mobile_no;
        this.occupation = occupation;
        this.ward_no = ward_no;
        this.admit_date = admit_date;
        this.release_date = release_date;
    }

    public Patient_info() {
    }

}
