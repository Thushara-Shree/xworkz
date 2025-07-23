package com.xworkz.internal;

public class ChargerInfo {
    private String charger;
    private String brand;
    private String compatibleDevice;

    public ChargerInfo(String charger, String brand, String compatibleDevice) {
        this.charger = charger;
        this.brand = brand;
        this.compatibleDevice = compatibleDevice;
    }

    @Override
    public String toString() {
        return "Charger Info:\n" +
                charger.toString() + "\n" +
                "Brand: " + brand + "\n" +
                "Compatible With: " + compatibleDevice;
    }
}

