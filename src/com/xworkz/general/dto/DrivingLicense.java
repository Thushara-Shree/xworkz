package com.xworkz.general.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DrivingLicense implements Serializable {

    private String name;
    private String Address;
    private long mobile;
    private LocalDate date;
    private  String type;

    public DrivingLicense() {
    }

    public DrivingLicense(String name, String address, long mobile, LocalDate date, String type) {
        this.name = name;
        Address = address;
        this.mobile = mobile;
        this.date = date;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DrivingLicense{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", mobile=" + mobile +
                ", date=" + date +
                ", type='" + type + '\'' +
                '}';
    }
}
