package com.xworkz.internal;

import com.xworkz.external.Marathon;

public class CityMarathon implements Marathon {

    @Override
    public void start() {
        System.out.println("The City Marathon has started.");
    }

    @Override
    public void run() {
        System.out.println("Running the City Marathon.");
    }

    @Override
    public void finish() {
        System.out.println("Finishing the City Marathon.");
    }
}

