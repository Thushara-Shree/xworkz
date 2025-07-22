package com.xworkz.internal;

import com.xworkz.external.Mug;

public class CeramicMug implements Mug {

    @Override
    public void fill() {
        System.out.println("Filling the ceramic mug with hot beverage.");
    }

    @Override
    public void drink() {
        System.out.println("Drinking from the ceramic mug.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the ceramic mug.");
    }

    @Override
    public void hold() {
        Mug.super.hold();
    }
}

