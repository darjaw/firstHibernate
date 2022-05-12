package com.test.hib.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_details_id")
    private int userDetailsId;
    @Column(name = "email") private String email;
    @Column(name = "age") private int age;
    @Column(name = "salary") private double salary;
    @Column(name = "state") private String state;

    //constructors
    public UserDetails() {
    }
    public UserDetails(String email,int age, double salary, String state) {

        this.email = email;
        this.age = age;
        this.salary = salary;
        this.state = state;
    }


    //getter and setters
    public int getUserDetailsId() {
        return userDetailsId;
    }
    public void setUserDetailsId(int userDetailsId) {
        this.userDetailsId = userDetailsId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getState() {
        return state;
    }

    public void setState(String city) {
        this.state = city;
    }
}
