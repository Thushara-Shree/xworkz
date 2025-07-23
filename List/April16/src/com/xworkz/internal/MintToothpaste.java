package com.xworkz.internal;

import com.xworkz.external.Toothpaste;

public class MintToothpaste implements Toothpaste {

    @Override
    public void apply() {
        System.out.println("Applying the mint toothpaste onto the toothbrush.");
    }

    @Override
    public void cleanTeeth() {
        System.out.println("Cleaning teeth with the mint toothpaste.");
    }

    @Override
    public void refreshBreath() {
        System.out.println("Refreshing breath with the mint toothpaste.");
    }
}

