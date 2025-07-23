package com.xworkz.late.internal.imple;

public class TaxiImpl implements Taxi {

    public TaxiImpl() {
        System.out.println("TaxiImpl object created.");
    }

    @Override
    public void ride() {
        System.out.println("Taking a ride in the taxi...");
    }
}
