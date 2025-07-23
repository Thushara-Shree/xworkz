package com.xworkz.internal;

public class Cup {
    private String material;
    private int capacity;
    private boolean hasHandle;

    public Cup(String material, int capacity, boolean hasHandle) {
        this.material = material;
        this.capacity = capacity;
        this.hasHandle = hasHandle;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Capacity: " + capacity + "ml, Handle: " + (hasHandle ? "Yes" : "No");
    }
}

