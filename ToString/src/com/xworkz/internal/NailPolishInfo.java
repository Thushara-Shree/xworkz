package com.xworkz.internal;

public class NailPolishInfo {
    private NailPolish nailPolish;
    private int volume;
    private String brand;

    public NailPolishInfo(NailPolish nailPolish, int volume, String brand) {
        this.nailPolish = nailPolish;
        this.volume = volume;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Nail Polish Info:\n" +
                nailPolish.toString() + "\n" +
                "Volume: " + volume + "ml\n" +
                "Brand: " + brand;
    }
}

