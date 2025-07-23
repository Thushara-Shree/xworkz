package com.xworkz.internal;

public class Building {
    private String name;
    private int floors;
    private boolean hasElevator;

    public Building(String name, int floors, boolean hasElevator) {
        this.name = name;
        this.floors = floors;
        this.hasElevator = hasElevator;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Floors: " + floors + ", Elevator: " + (hasElevator ? "Yes" : "No");
    }
}

