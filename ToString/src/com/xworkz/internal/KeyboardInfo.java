package com.xworkz.internal;

public class KeyboardInfo {
    private Keyboard keyboard;
    private String brand;
    private int price;

    public KeyboardInfo(Keyboard keyboard, String brand, int price) {
        this.keyboard = keyboard;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard Info:\n" +
                keyboard.toString() + "\n" +
                "Brand: " + brand + "\n" +
                "Price: ₹" + price;
    }
}

