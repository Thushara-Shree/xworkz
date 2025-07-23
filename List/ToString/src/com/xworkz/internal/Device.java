package com.xworkz.internal;

public class Device {
    private String name;
    private String type;
    private boolean isPortable;

    public Device(String name, String type, boolean isPortable) {
        this.name = name;
        this.type = type;
        this.isPortable = isPortable;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Portable: " + (isPortable ? "Yes" : "No");
    }
}

