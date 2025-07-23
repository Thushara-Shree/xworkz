package com.xworkz.internal;

import com.xworkz.external.Bar;
import com.xworkz.external.Beer;

public class Alcohol implements Beer, Bar {

    @Override
    public void chill() {
        System.out.println("Running in Alcohol");
    }

    @Override
    public void clean() {
        System.out.println("Running in Alcohol");

    }

    @Override
    public void drink() {
        System.out.println("Running in Alcohol");
    }


    @Override
    public void pour() {
        System.out.println("Running in Alcohol");
    }

    @Override
    public void playMusic() {
        System.out.println("Running in Alcohol");
    }

    @Override
    public void serveDrink() {
        System.out.println("Running in Alcohol");
    }
}
