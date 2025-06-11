package com.xworkz.general.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageCerti implements Serializable {

    private String groomName;
    private String brideName;
    private String location;
    private String address;
    private String religion;
    private LocalDate date;
    private String witness1;
    private String witness2;
    private String officier;

    public MarriageCerti() {
    }

    public MarriageCerti(String groomName, String officier, String witness2, String witness1, LocalDate date, String religion, String location, String address, String brideName) {
        this.groomName = groomName;
        this.officier = officier;
        this.witness2 = witness2;
        this.witness1 = witness1;
        this.date = date;
        this.religion = religion;
        this.location = location;
        this.address = address;
        this.brideName = brideName;
    }

    public String getGroomName() {
        return groomName;
    }

    public void setGroomName(String groomName) {
        this.groomName = groomName;
    }

    public String getOfficier() {
        return officier;
    }

    public void setOfficier(String officier) {
        this.officier = officier;
    }

    public String getWitness2() {
        return witness2;
    }

    public void setWitness2(String witness2) {
        this.witness2 = witness2;
    }

    public String getWitness1() {
        return witness1;
    }

    public void setWitness1(String witness1) {
        this.witness1 = witness1;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBrideName() {
        return brideName;
    }

    public void setBrideName(String brideName) {
        this.brideName = brideName;
    }

    @Override
    public String toString() {
        return "MarriageCerti{" +
                "groomName='" + groomName + '\'' +
                ", brideName='" + brideName + '\'' +
                ", location='" + location + '\'' +
                ", address='" + address + '\'' +
                ", religion='" + religion + '\'' +
                ", date=" + date +
                ", witness1='" + witness1 + '\'' +
                ", witness2='" + witness2 + '\'' +
                ", officier='" + officier + '\'' +
                '}';
    }
}
