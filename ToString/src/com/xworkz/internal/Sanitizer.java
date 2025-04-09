package com.xworkz.internal;

public class Sanitizer {
    private String type;
    private int alcoholPercentage;
    private boolean isScented;

    public Sanitizer(String type, int alcoholPercentage, boolean isScented) {
        this.type = type;
        this.alcoholPercentage = alcoholPercentage;
        this.isScented = isScented;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Alcohol: " + alcoholPercentage + "%, Scented: " + (isScented ? "Yes" : "No");
    }
}
