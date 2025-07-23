package com.xworkz.internal;

import com.xworkz.external.Bulb;

public class IncandescentBulb implements Bulb {

    @Override
    public void turnOn() {
        System.out.println("Turning on the incandescent bulb.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the incandescent bulb.");
    }

    @Override
    public void flicker() {
        System.out.println("The incandescent bulb is flickering.");
    }
}

