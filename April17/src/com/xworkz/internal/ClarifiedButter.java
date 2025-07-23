package com.xworkz.internal;

import com.xworkz.external.Ghee;

public class ClarifiedButter implements Ghee {

    @Override
    public void melt() {
        System.out.println("Melting the ghee (clarified butter).");
    }

    @Override
    public void cook() {
        System.out.println("Cooking with the ghee.");
    }

    @Override
    public void flavor() {
        System.out.println("Enhancing the flavor with ghee.");
    }
}

