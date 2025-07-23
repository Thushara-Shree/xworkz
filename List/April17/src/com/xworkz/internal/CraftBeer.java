package com.xworkz.internal;

import com.xworkz.external.Beer;

public class CraftBeer implements Beer {

    @Override
    public void pour() {
        System.out.println("Pouring the craft beer into a glass.");
    }

    @Override
    public void drink() {
        System.out.println("Drinking the craft beer.");
    }

    @Override
    public void chill() {
        System.out.println("Chilling the craft beer.");
    }

    @Override
    public void formula() {
        Beer.super.formula();
    }
}
