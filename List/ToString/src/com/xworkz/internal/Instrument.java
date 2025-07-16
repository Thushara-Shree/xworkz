package com.xworkz.internal;

public class Instrument {
    private String name;
    private String type;
    private boolean isElectronic;

    public Instrument(String name, String type, boolean isElectronic) {
        this.name = name;
        this.type = type;
        this.isElectronic = isElectronic;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Electronic: " + (isElectronic ? "Yes" : "No");
    }
}

