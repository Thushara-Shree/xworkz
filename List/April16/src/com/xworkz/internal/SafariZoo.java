package com.xworkz.internal;

import com.xworkz.external.Zoo;

public class SafariZoo implements Zoo {

    @Override
    public void open() {
        System.out.println("The Safari Zoo is now open.");
    }

    @Override
    public void feedAnimals() {
        System.out.println("Feeding the animals in the Safari Zoo.");
    }

    @Override
    public void close() {
        System.out.println("The Safari Zoo is now closed.");
    }
}

