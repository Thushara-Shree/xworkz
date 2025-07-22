package com.xworkz.internal;

public class Water {
    private String source;
    private double pHLevel;
    private boolean isDrinkable;

    public Water(String source, double pHLevel, boolean isDrinkable) {
        this.source = source;
        this.pHLevel = pHLevel;
        this.isDrinkable = isDrinkable;
    }

    @Override
    public String toString() {
        return "Source: " + source + ", pH Level: " + pHLevel + ", Drinkable: " + (isDrinkable ? "Yes" : "No");
    }
}

