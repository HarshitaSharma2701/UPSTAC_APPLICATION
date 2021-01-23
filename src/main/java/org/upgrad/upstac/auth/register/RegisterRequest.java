package org.upgrad.upstac.auth.register;


import io.swagger.models.auth.In;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.upgrad.upstac.users.models.Gender;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RegisterRequest {
    private String userName;

    private String password;
    private String firstName;

    private String email="";

    private String phoneNumber="";

    private String lastName;

    private String address;

    private Integer pinCode;

    private String dateOfBirth;

    private Gender gender;



    public String getUserName() {
        return userName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = "password";
    }

    public String getAddress() {
        return address;
    }

    public void setUserName(String userName) {
        this.userName =userName;
    }


    public void setFirstName(String user) {
        this.firstName = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public Gender getGender() {
        return  gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setGender(Gender gender) {
        this.gender = gender;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
