package com.xworkz.internal;

public class BuildingInfo {
    private Building building;
    private String location;
    private String purpose;

    public BuildingInfo(Building building, String location, String purpose) {
        this.building = building;
        this.location = location;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Building Info:\n" +
                building.toString() + "\n" +
                "Location: " + location + "\n" +
                "Purpose: " + purpose;
    }
}

