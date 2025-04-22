package com.xworkz.late.external.user;


import com.xworkz.late.internal.imple.Taxi;

public class TaxiUser {
    private Taxi taxi;

    public TaxiUser(Taxi taxi) {
        this.taxi = taxi;
    }

    public void useTaxi() {
        if (taxi != null) {
            taxi.ride();
        } else {
            System.out.println("Taxi is not initialized.");
        }
    }
}
