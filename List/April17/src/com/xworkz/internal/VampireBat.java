package com.xworkz.internal;

import com.xworkz.external.Bag;
import com.xworkz.external.Bat;

public class VampireBat implements Bat {

    @Override
    public void fly() {
        System.out.println("The vampire bat is flying.");
    }

    @Override
    public void screech() {
        System.out.println("The vampire bat is screeching.");
    }

    @Override
    public void hang() {
        System.out.println("The vampire bat is hanging upside down.");
    }

    @Override
    public void hit() {
        Bat.super.hit();
    }
}

