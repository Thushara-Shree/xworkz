package com.xworkz.late.internal.imple;

public class BoatImpl implements Boat {

    public BoatImpl() {
        System.out.println("BoatImpl object created.");
    }

    @Override
    public void sail() {
        System.out.println("Sailing the boat...");
    }
}
