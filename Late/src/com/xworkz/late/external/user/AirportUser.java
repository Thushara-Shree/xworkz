package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Airport;

public class AirportUser {
    private Airport airport;

    public AirportUser(Airport airport) {
        this.airport = airport;
    }

    public void useAirport() {
        if (airport != null) {
            airport.boardFlight();
        } else {
            System.out.println("Airport is not initialized.");
        }
    }
}
