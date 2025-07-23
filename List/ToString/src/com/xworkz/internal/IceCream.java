package com.xworkz.internal;

public class IceCream {
    private String flavor;
    private String type;
    private boolean hasToppings;

    public IceCream(String flavor, String type, boolean hasToppings) {
        this.flavor = flavor;
        this.type = type;
        this.hasToppings = hasToppings;
    }

    @Override
    public String toString() {
        return "Flavor: " + flavor + ", Type: " + type + ", Has Toppings: " + (hasToppings ? "Yes" : "No");
    }
}
