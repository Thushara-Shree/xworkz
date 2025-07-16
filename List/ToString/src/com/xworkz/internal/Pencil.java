package com.xworkz.internal;

public class Pencil {
    private String brand;
    private String color;
    private boolean isSharpened;

    public Pencil(String brand, String color, boolean isSharpened) {
        this.brand = brand;
        this.color = color;
        this.isSharpened = isSharpened;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Color: " + color + ", Sharpened: " + (isSharpened ? "Yes" : "No");
    }
}

