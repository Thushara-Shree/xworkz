package com.xworkz.internal;

public class Charger {
    private String type;
    private int power;
    private boolean isFastCharging;

    public Charger(String type, int power, boolean isFastCharging) {
        this.type = type;
        this.power = power;
        this.isFastCharging = isFastCharging;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Power: " + power + "W, Fast Charging: " + (isFastCharging ? "Yes" : "No");
    }
}

