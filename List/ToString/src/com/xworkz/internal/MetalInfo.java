package com.xworkz.internal;

public class MetalInfo {
    private Metal metal;
    private String usage;
    private String appearance;

    public MetalInfo(Metal metal, String usage, String appearance) {
        this.metal = metal;
        this.usage = usage;
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "Metal Info:\n" +
                metal.toString() + "\n" +
                "Usage: " + usage + "\n" +
                "Appearance: " + appearance;
    }
}

