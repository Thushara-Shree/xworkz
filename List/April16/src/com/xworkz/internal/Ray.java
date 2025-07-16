package com.xworkz.internal;

import com.xworkz.external.Bulb;
import com.xworkz.external.Light;

public class Ray implements Light, Bulb {

    @Override
    public void turnOn() {
        System.out.println("Running in Ray");
    }

    @Override
    public void turnOff() {
        System.out.println("Running in Ray");
    }

    @Override
    public void flicker() {
        System.out.println("Running in Ray");
    }

    @Override
    public void dim() {
        System.out.println("Running in Ray");
    }



}
