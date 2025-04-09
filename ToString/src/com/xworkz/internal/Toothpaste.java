package com.xworkz.internal;

public class Toothpaste {
    private String flavor;
    private boolean hasFluoride;
    private String purpose;

    public Toothpaste(String flavor, boolean hasFluoride, String purpose) {
        this.flavor = flavor;
        this.hasFluoride = hasFluoride;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Flavor: " + flavor + ", Fluoride: " + (hasFluoride ? "Yes" : "No") + ", Purpose: " + purpose;
    }
}
