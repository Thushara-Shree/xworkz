package com.xworkz.internal;

import com.xworkz.external.Taxi;
import com.xworkz.external.Train;

public class Passenger implements Train, Taxi {

    @Override
    public void stop() {
        System.out.println("Running in Passanger");

    }

    @Override
    public void accelerate() {
        System.out.println("Running in Passanger");
    }

    @Override
    public void drive() {
        System.out.println("Running in Passanger");
    }

    @Override
    public void start() {
        System.out.println("Running in Passanger");
    }

    @Override
    public void dropOff() {
        System.out.println("Running in Passanger");
    }

    @Override
    public void pickUp() {
        System.out.println("Running in Passanger");
    }
}
