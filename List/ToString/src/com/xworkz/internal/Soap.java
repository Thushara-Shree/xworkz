package com.xworkz.internal;

public class Soap {
    private String brand;
    private String fragrance;
    private boolean isAntibacterial;

    public Soap(String brand, String fragrance, boolean isAntibacterial) {
        this.brand = brand;
        this.fragrance = fragrance;
        this.isAntibacterial = isAntibacterial;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Fragrance: " + fragrance + ", Antibacterial: " + (isAntibacterial ? "Yes" : "No");
    }
}

