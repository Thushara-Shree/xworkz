package com.xworkz.internal;

import com.xworkz.external.Scale;

public class DigitalScale implements Scale {

    @Override
    public void calibrate() {
        System.out.println("Calibrating the digital scale.");
    }

    @Override
    public void weigh() {
        System.out.println("Weighing an object on the digital scale.");
    }

    @Override
    public void reset() {
        System.out.println("Resetting the digital scale.");
    }

    @Override
    public void measure() {
        Scale.super.measure();
    }
}
