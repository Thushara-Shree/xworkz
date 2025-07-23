package com.xworkz.internal;

import com.xworkz.external.Tap;
import com.xworkz.external.Tin;

public class Equipment implements Tap, Tin {

    @Override
    public void store() {
        System.out.println("Running in class Equipment");
    }

    @Override
    public void use() {
        System.out.println("Running in class Equipment");

    }

    @Override
    public void cost() {
        System.out.println("Running in class Equipment");

    }

    @Override
    public void drip() {
        System.out.println("Running in class Equipment");

    }

    @Override
    public void turnOff() {
        System.out.println("Running in class Equipment");

    }

    @Override
    public void turnOn() {
        System.out.println("Running in class Equipment");

    }
}
