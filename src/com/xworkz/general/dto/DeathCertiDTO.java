package com.xworkz.general.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class DeathCertiDTO implements Serializable {

    private String name;
    private String cause;
    private LocalDate date;
    private LocalTime time;
    private int ageAtDeath;
    private String certifiedBy;
    private String hospitalName;
    private String mannerOfDeath;
    private String gender;
    private String Marks;

    public DeathCertiDTO() {
    }

    public DeathCertiDTO(String name, String cause, LocalDate date, LocalTime time, int ageAtDeath, String certifiedBy, String mannerOfDeath, String hospitalName, String gender, String marks) {
        this.name = name;
        this.cause = cause;
        this.date = date;
        this.time = time;
        this.ageAtDeath = ageAtDeath;
        this.certifiedBy = certifiedBy;
        this.mannerOfDeath = mannerOfDeath;
        this.hospitalName = hospitalName;
        this.gender = gender;
        Marks = marks;
    }

    public String getMarks() {
        return Marks;
    }

    public void setMarks(String marks) {
        Marks = marks;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMannerOfDeath() {
        return mannerOfDeath;
    }

    public void setMannerOfDeath(String mannerOfDeath) {
        this.mannerOfDeath = mannerOfDeath;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCertifiedBy() {
        return certifiedBy;
    }

    public void setCertifiedBy(String certifiedBy) {
        this.certifiedBy = certifiedBy;
    }

    public int getAgeAtDeath() {
        return ageAtDeath;
    }

    public void setAgeAtDeath(int ageAtDeath) {
        this.ageAtDeath = ageAtDeath;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeathCertiDTO{" +
                "name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", ageAtDeath=" + ageAtDeath +
                ", certifiedBy='" + certifiedBy + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", mannerOfDeath='" + mannerOfDeath + '\'' +
                ", gender='" + gender + '\'' +
                ", Marks='" + Marks + '\'' +
                '}';
    }
}
