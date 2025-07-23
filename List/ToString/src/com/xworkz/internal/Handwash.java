package com.xworkz.internal;

public class Handwash {
    private String fragrance;
    private boolean isAntibacterial;
    private String color;

    public Handwash(String fragrance, boolean isAntibacterial, String color) {
        this.fragrance = fragrance;
        this.isAntibacterial = isAntibacterial;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fragrance: " + fragrance + ", Antibacterial: " + (isAntibacterial ? "Yes" : "No") + ", Color: " + color;
    }
}

