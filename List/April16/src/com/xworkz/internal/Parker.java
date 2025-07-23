package com.xworkz.internal;

import com.xworkz.external.Pen;

public class Parker implements Pen {

    @Override
    public void type() {
        System.out.println("Running type in Pakrker");
    }

    @Override
    public void ink() {
        System.out.println("Running ink in Parker");
    }

    @Override
    public void write() {
        System.out.println("Running write in Pareker");
    }
}
