package com.xworkz.internal;

public class KettleInfo {
    private String kettle;
    private String owner;
    private String brand;

    public KettleInfo(String kettle, String owner, String brand) {
        this.kettle = kettle;
        this.owner = owner;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Kettle Info:\n" +
                kettle.toString() + "\n" +
                "Owner: " + owner + "\n" +
                "Brand: " + brand;
    }
}

