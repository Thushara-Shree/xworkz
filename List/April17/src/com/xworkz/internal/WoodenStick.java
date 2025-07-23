package com.xworkz.internal;

import com.xworkz.external.Stick;

public class WoodenStick implements Stick {

    @Override
    public void breakIt() {
        System.out.println("Breaking the wooden stick.");
    }

    @Override
    public void useIt() {
        System.out.println("Using the wooden stick as a support.");
    }

    @Override
    public void bendIt() {
        System.out.println("Bending the wooden stick.");
    }

    @Override
    public void hit() {
        Stick.super.hit();
    }
}
