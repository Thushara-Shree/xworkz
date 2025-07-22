package com.xworkz.internal;

import com.xworkz.external.Money;
import com.xworkz.external.Movie;

public class Theater implements Movie, Money {

    @Override
    public void stop() {
        System.out.println("Running in Theater");

    }

    @Override
    public void earn() {
        System.out.println("Running in Theater");
    }

    @Override
    public void pause() {
        System.out.println("Running in Theater");
    }

    @Override
    public void play() {
        System.out.println("Running in Theater");
    }

    @Override
    public void save() {
        System.out.println("Running in Theater");
    }

    @Override
    public void spend() {
        System.out.println("Running in Theater");
    }
}
