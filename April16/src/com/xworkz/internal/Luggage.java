package com.xworkz.internal;

import com.xworkz.external.Bag;

public class Luggage implements Bag {

    @Override
    public void carry() {
        System.out.println("Running carry in Luggage");
    }

    @Override
    public void weight() {
        System.out.println("Running weight in Luggage");
    }

    @Override
    public void color() {
        System.out.println("Running color in Luggage");
    }
}
