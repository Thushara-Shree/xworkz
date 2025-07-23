package com.xworkz.internal;

import com.xworkz.external.Train;

public class PassengerTrain implements Train {

    @Override
    public void start() {
        System.out.println("The passenger train is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The passenger train is stopping.");
    }

    @Override
    public void accelerate() {
        System.out.println("The passenger train is accelerating.");
    }
}
