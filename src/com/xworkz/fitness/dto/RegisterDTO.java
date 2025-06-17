package com.xworkz.fitness.dto;

import java.io.Serializable;

public class RegisterDTO implements Serializable {


    private String name;
    private int age;
    private long number;
    private String email;
    private String bloodGrp;
    private String address;
    private String city;
    private boolean subscription;

    public RegisterDTO() {
    }

    public RegisterDTO(String name, int age, long number, String email, String bloodGrp, String address, String city, boolean subscription) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.email = email;
        this.bloodGrp = bloodGrp;
        this.address = address;
        this.city = city;
        this.subscription = subscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isSubscription() {
        return subscription;
    }

    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "registerDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", email='" + email + '\'' +
                ", bloodGrp='" + bloodGrp + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", subscription=" + subscription +
                '}';
    }
}
