package com.xworkz.internal;

import com.xworkz.external.Ice;
import com.xworkz.external.IceCream;

public class Cold implements Ice, IceCream {

    @Override
    public void melt() {
        System.out.println("Running in Cold");
    }

    @Override
    public void chill() {
        System.out.println("Running in Cold");
    }

    @Override
    public void freeze() {
        System.out.println("Running in Cold");
    }

    @Override
    public void serve() {
        System.out.println("Running in Cold");
    }

}
