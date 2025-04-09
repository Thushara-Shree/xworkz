package com.xworkz.internal;

public class CreamInfo {
    private Cream cream;
    private int quantity;
    private String brand;

    public CreamInfo(Cream cream, int quantity, String brand) {
        this.cream = cream;
        this.quantity = quantity;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Cream Info:\n" +
                cream.toString() + "\n" +
                "Quantity: " + quantity + "ml\n" +
                "Brand: " + brand;
    }
}

