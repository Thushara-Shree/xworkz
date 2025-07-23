package com.xworkz.internal;

public class Metal {
    private String name;
    private double density;
    private boolean isMagnetic;

    public Metal(String name, double density, boolean isMagnetic) {
        this.name = name;
        this.density = density;
        this.isMagnetic = isMagnetic;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Density: " + density + " g/cm³, Magnetic: " + (isMagnetic ? "Yes" : "No");
    }
}

