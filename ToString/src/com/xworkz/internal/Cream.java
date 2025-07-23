package com.xworkz.internal;

public class Cream {
    private String name;
    private String purpose;
    private boolean isForSensitiveSkin;

    public Cream(String name, String purpose, boolean isForSensitiveSkin) {
        this.name = name;
        this.purpose = purpose;
        this.isForSensitiveSkin = isForSensitiveSkin;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Purpose: " + purpose + ", For Sensitive Skin: " + (isForSensitiveSkin ? "Yes" : "No");
    }
}

