package com.spring_batch.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer_profile", schema = "springbatch")
@Data
public class Customer_Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CUSTOMER_ID")
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String last_name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "CONTACT")
    private String contact_no;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "DOB")
    private String dob;

    public Customer_Profile(int id, String firstName, String last_name, String email, String gender, String contact_no, String country, String dob) {
        this.id = id;
        this.firstName = firstName;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.contact_no = contact_no;
        this.country = country;
        this.dob = dob;
    }

    public Customer_Profile() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Customer_Profile{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", contact_no='" + contact_no + '\'' +
                ", country='" + country + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
