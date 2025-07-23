package com.xworkz.internal;

import com.xworkz.external.Fish;

public class Goldfish implements Fish {

    @Override
    public void swim() {
        System.out.println("The goldfish is swimming.");
    }

    @Override
    public void eat() {
        System.out.println("The goldfish is eating.");
    }

    @Override
    public void breathe() {
        System.out.println("The goldfish is breathing underwater.");
    }

    @Override
    public void type() {
        Fish.super.type();
    }
}

