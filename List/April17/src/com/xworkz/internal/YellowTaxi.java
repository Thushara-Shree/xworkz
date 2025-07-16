package com.xworkz.internal;

import com.xworkz.external.Taxi;

public class YellowTaxi implements Taxi {

    @Override
    public void pickUp() {
        System.out.println("Picking up the passenger.");
    }

    @Override
    public void drive() {
        System.out.println("Driving to the destination.");
    }

    @Override
    public void dropOff() {
        System.out.println("Dropping off the passenger at the destination.");
    }

    @Override
    public void ride() {
        Taxi.super.ride();
    }
}

