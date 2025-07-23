package com.xworkz.internal;

import com.xworkz.external.Rain;
import com.xworkz.external.River;

public class WaterSource implements River, Rain {

    @Override
    public void pour() {
        System.out.println("Running in waterSouce");

    }

    @Override
    public void bend() {

        System.out.println("Running in waterSouce");

    }

    @Override
    public void fall() {
        System.out.println("Running in waterSouce");

    }

    @Override
    public void flow() {
        System.out.println("Running in waterSouce");

    }

    @Override
    public void provideWater() {
        System.out.println("Running in waterSouce");

    }

    @Override
    public void stop() {
        System.out.println("Running in waterSouce");

    }
}
