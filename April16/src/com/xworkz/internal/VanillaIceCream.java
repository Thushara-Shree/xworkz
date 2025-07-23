package com.xworkz.internal;

import com.xworkz.external.IceCream;

public class VanillaIceCream implements IceCream {

    @Override
    public void serve() {
        System.out.println("Serving vanilla ice cream.");
    }

    @Override
    public void melt() {
        System.out.println("Vanilla ice cream is melting.");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing the vanilla ice cream.");
    }
}

