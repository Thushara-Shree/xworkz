package com.xworkz.internal;

public class SoapInfo {
    private Soap soap;
    private int weight;
    private String color;

    public SoapInfo(Soap soap, int weight, String color) {
        this.soap = soap;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Soap Info:\n" +
                soap.toString() + "\n" +
                "Weight: " + weight + "g\n" +
                "Color: " + color;
    }
}

