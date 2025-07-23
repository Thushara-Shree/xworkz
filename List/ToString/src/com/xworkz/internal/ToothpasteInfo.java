package com.xworkz.internal;

public class ToothpasteInfo {
    private Toothpaste toothpaste;
    private String brand;
    private int weight;

    public ToothpasteInfo(Toothpaste toothpaste, String brand, int weight) {
        this.toothpaste = toothpaste;
        this.brand = brand;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toothpaste Info:\n" +
                toothpaste.toString() + "\n" +
                "Brand: " + brand + "\n" +
                "Weight: " + weight + "g";
    }
}
