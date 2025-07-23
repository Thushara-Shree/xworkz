package com.xworkz.internal;

import com.xworkz.external.Flower;

public class Rose implements Flower {

    @Override
    public void bloom() {
        System.out.println("The rose is blooming.");
    }

    @Override
    public void fragrance() {
        System.out.println("The rose is releasing its fragrance.");
    }

    @Override
    public void wither() {
        System.out.println("The rose is withering.");
    }

    @Override
    public void smell() {
        Flower.super.smell();
    }
}

