package com.xworkz.internal;

import com.xworkz.external.Computer;

public class Laptop implements Computer {

    @Override
    public void cost() {
        System.out.println("Running cost in Laptop");
    }

    @Override
    public void company() {
        System.out.println("Running company in Laptop");
    }

    @Override
    public void model() {
        System.out.println("Running model in Laptop");
    }

    @Override
    public void games() {
        Computer.super.games();
    }
}
