package com.xworkz.internal;

public class Alcohol {
    private String name;
    private double percentage;
    private String type;

    public Alcohol(String name, double percentage, String type) {
        this.name = name;
        this.percentage = percentage;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Alcohol %: " + percentage + ", Type: " + type;
    }
}
