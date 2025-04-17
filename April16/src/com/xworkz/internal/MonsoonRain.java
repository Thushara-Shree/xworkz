package com.xworkz.internal;

import com.xworkz.external.Rain;

public class MonsoonRain implements Rain {

    @Override
    public void fall() {
        System.out.println("The rain is falling from the clouds.");
    }

    @Override
    public void stop() {
        System.out.println("The rain has stopped.");
    }

    @Override
    public void pour() {
        System.out.println("The rain is pouring heavily.");
    }
}

