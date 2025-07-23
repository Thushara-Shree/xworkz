package com.xworkz.internal;

import com.xworkz.external.Cloth;

public class Tshirt implements Cloth {

    @Override
    public void wear() {
        System.out.println("Wearing the T-shirt.");
    }

    @Override
    public void wash() {
        System.out.println("Washing the T-shirt.");
    }

    @Override
    public void fold() {
        System.out.println("Folding the T-shirt.");
    }

    @Override
    public void cost() {
        Cloth.super.cost();
    }
}

