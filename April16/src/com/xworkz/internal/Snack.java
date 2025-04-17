package com.xworkz.internal;

import com.xworkz.external.Chips;

public class Snack implements Chips {

    @Override
    public void oil() {
        System.out.println("Running oil in Snack");
    }

    @Override
    public void flavor() {
        System.out.println("Running flavor in Snack");
    }

    @Override
    public void type() {
        System.out.println("Running type in Snack");
    }
}
