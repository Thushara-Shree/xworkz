package com.xworkz.internal;

public class Guitar {
    private String type;
    private int numberOfStrings;
    private boolean isElectric;

    public Guitar(String type, int numberOfStrings, boolean isElectric) {
        this.type = type;
        this.numberOfStrings = numberOfStrings;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Strings: " + numberOfStrings + ", Electric: " + (isElectric ? "Yes" : "No");
    }
}

