package com.xworkz.internal;

public class Kettle {
    private String type;
    private int capacity;
    private boolean isElectric;

    public Kettle(String type, int capacity, boolean isElectric) {
        this.type = type;
        this.capacity = capacity;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Capacity: " + capacity + "ml, Electric: " + (isElectric ? "Yes" : "No");
    }
}

