package com.xworkz.internal;

import com.xworkz.external.Water;

public class RiverWater implements Water {

    @Override
    public void boil() {
        System.out.println("Boiling the river water.");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing the river water.");
    }

    @Override
    public void flow() {
        System.out.println("The river water is flowing.");
    }
}

