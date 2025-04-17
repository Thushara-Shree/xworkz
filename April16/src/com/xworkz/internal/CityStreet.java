package com.xworkz.internal;

import com.xworkz.external.Street;

public class CityStreet implements Street {

    @Override
    public void open() {
        System.out.println("Opening the street for traffic.");
    }

    @Override
    public void close() {
        System.out.println("Closing the street for construction.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the damaged sections of the street.");
    }
}
