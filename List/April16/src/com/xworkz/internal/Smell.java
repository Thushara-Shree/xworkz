package com.xworkz.internal;


import com.xworkz.external.Deodrant;
import com.xworkz.external.Flower;

public class Smell implements Deodrant, Flower {

    @Override
    public void smell() {
        System.out.println("Running in smell");
    }

    @Override
    public void cost() {
        System.out.println("Running in smell");
    }

    @Override
    public void gas() {
        System.out.println("Running in smell");
    }

    @Override
    public void bloom() {
        System.out.println("Running in smell");
    }

    @Override
    public void fragrance() {
        System.out.println("Running in smell");
    }

    @Override
    public void wither() {
        System.out.println("Running in smell");
    }
}
