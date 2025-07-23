package com.xworkz.internal;

import com.xworkz.external.Cupboard;

public class WoodenCupboard implements Cupboard {

    @Override
    public void open() {
        System.out.println("Opening the wooden cupboard.");
    }

    @Override
    public void close() {
        System.out.println("Closing the wooden cupboard.");
    }

    @Override
    public void organize() {
        System.out.println("Organizing the items in the wooden cupboard.");
    }

    @Override
    public void material() {
        Cupboard.super.material();
    }
}

