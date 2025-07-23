package com.xworkz.internal;

import com.xworkz.external.Deodrant;

public class Perfume implements Deodrant {

    @Override
    public void cost() {
        System.out.println("Running cost in Perfume");
    }

    @Override
    public void gas() {
        System.out.println("Running gas in Perfume");
    }

    @Override
    public void smell() {
        System.out.println("Running smell in Perfume");
    }
}
