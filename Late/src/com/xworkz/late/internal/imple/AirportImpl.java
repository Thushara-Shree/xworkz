package com.xworkz.late.internal.imple;

public class AirportImpl implements Airport {

    public AirportImpl() {
        System.out.println("AirportImpl object created.");
    }

    @Override
    public void boardFlight() {
        System.out.println("Boarding the flight at the airport...");
    }
}
