package com.xworkz.internal;

import com.xworkz.external.Pencil;
import com.xworkz.external.Scale;

public class Draw implements Scale, Pencil {

    @Override
    public void sharpen() {
        System.out.println("Running in Draw");
    }

    @Override
    public void erase() {
        System.out.println("Running in Draw");
    }

    @Override
    public void write() {
        System.out.println("Running in Draw");
    }

    @Override
    public void calibrate() {
        System.out.println("Running in Draw");
    }

    @Override
    public void reset() {
        System.out.println("Running in Draw");
    }

    @Override
    public void weigh() {
        System.out.println("Running in Draw");
    }
}
