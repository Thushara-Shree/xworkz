package com.xworkz.internal;

public class GuitarInfo {
    private Guitar guitar;
    private String brand;
    private int price;

    public GuitarInfo(Guitar guitar, String brand, int price) {
        this.guitar = guitar;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Guitar Info:\n" +
                guitar.toString() + "\n" +
                "Brand: " + brand + "\n" +
                "Price: ₹" + price;
    }
}
