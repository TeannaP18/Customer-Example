package hbcu.stay.ready.customerweb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotNull;

public class Customer {

    private SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy");
    @NotNull
    private String name;
    @NotNull
    private String password;
    @NotNull
    private String accountNumber;
    @NotNull
    private String socialSecurity;
    @NotNull
    private Date birthday;
    @NotNull
    private String email;
    @NotNull
    private String address;
    @NotNull
    private String contactNumber;


    public Customer(String name, String password, String socialSecurity, Date birthday, String email, String address, String contactNumber){
        this.name = name;
        this.password = password;
        this.accountNumber = UUID.randomUUID().toString().replaceAll("-","");
        this.socialSecurity = socialSecurity;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public Customer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
