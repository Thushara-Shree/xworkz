package com.xworkz.internal;

import com.xworkz.external.Pen;
import com.xworkz.external.Pencil;

public class Write implements Pen, Pencil {

    @Override
    public void write() {
        System.out.println("Running in Write");

    }

    @Override
    public void ink() {
        System.out.println("Running in Write");

    }

    @Override
    public void type() {
        System.out.println("Running in Write");

    }

    @Override
    public void erase() {
        System.out.println("Running in Write");

    }

    @Override
    public void sharpen() {
        System.out.println("Running in Write");

    }


}
