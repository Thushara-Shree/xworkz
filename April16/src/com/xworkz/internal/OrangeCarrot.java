package com.xworkz.internal;

import com.xworkz.external.Carrot;

public class OrangeCarrot implements Carrot {

    @Override
    public void grow() {
        System.out.println("The carrot is growing in the soil.");
    }

    @Override
    public void harvest() {
        System.out.println("The carrot is being harvested.");
    }

    @Override
    public void eat() {
        System.out.println("The carrot is being eaten.");
    }
}

