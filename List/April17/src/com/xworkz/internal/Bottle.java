package com.xworkz.internal;

import com.xworkz.external.Tupperware;

public class Bottle implements Tupperware {

    @Override
    public void cost() {
        System.out.println("Running cost in Bottle");
    }

    @Override
    public void plastic() {
        System.out.println("Running plastic in Bottle");
    }

    @Override
    public void pet() {
        System.out.println("Running pet in Bottle");
    }

    @Override
    public void store() {
        Tupperware.super.store();
    }
}
