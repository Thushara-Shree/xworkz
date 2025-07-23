package com.xworkz.internal;

import com.xworkz.external.Light;

public class LEDLight implements Light {

    @Override
    public void turnOn() {
        System.out.println("Turning on the LED light.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the LED light.");
    }

    @Override
    public void dim() {
        System.out.println("Dimming the LED light.");
    }
}
