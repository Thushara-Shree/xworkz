package com.xworkz.internal;

import com.xworkz.external.Ice;

public class IceCube implements Ice {

    @Override
    public void freeze() {
        System.out.println("Freezing water to form ice cubes.");
    }

    @Override
    public void melt() {
        System.out.println("The ice cube is melting.");
    }

    @Override
    public void chill() {
        System.out.println("Chilling a drink with the ice cube.");
    }

    @Override
    public void cold() {
        Ice.super.cold();
    }
}

