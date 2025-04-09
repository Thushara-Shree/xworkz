package com.xworkz.internal;

public class Aeroplane {
    private String model;
    private int capacity;
    private boolean isInternational;

    public Aeroplane(String model, int capacity, boolean isInternational) {
        this.model = model;
        this.capacity = capacity;
        this.isInternational = isInternational;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Capacity: " + capacity + ", International: " + (isInternational ? "Yes" : "No");
    }
}

