package com.xworkz.internal;

public class IceCreamInfo {
    private IceCream iceCream;
    private int quantity;
    private String brand;

    public IceCreamInfo(IceCream iceCream, int quantity, String brand) {
        this.iceCream = iceCream;
        this.quantity = quantity;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Ice Cream Info:\n" +
                iceCream.toString() + "\n" +
                "Quantity: " + quantity + "ml\n" +
                "Brand: " + brand;
    }
}

