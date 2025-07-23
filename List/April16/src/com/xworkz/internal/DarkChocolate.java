package com.xworkz.internal;

import com.xworkz.external.Chocolate;

public class DarkChocolate implements Chocolate {

    @Override
    public void melt() {
        System.out.println("Dark chocolate is melting...");
    }

    @Override
    public void eat() {
        System.out.println("Eating dark chocolate!");
    }

    @Override
    public void smell() {
        System.out.println("Smells rich and cocoa-y!");
    }
}

