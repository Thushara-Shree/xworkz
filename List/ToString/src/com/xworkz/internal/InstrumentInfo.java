package com.xworkz.internal;

public class InstrumentInfo {
    private String instrument;
    private String brand;
    private String owner;

    public InstrumentInfo(String instrument, String brand, String owner) {
        this.instrument = instrument;
        this.brand = brand;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Instrument Info:\n" +
                instrument.toString() + "\n" +
                "Brand: " + brand + "\n" +
                "Owner: " + owner;
    }
}
