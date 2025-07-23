package com.xworkz.internal;

public class WaterInfo {
    private Water water;
    private String containerType;
    private String location;

    public WaterInfo(Water water, String containerType, String location) {
        this.water = water;
        this.containerType = containerType;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Water Info:\n" +
                water.toString() + "\n" +
                "Container: " + containerType + "\n" +
                "Location: " + location;
    }
}

