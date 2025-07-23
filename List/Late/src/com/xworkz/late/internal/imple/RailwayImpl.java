package com.xworkz.late.internal.imple;

public class RailwayImpl implements Railway {

    public RailwayImpl() {
        System.out.println("RailwayImpl object created.");
    }

    @Override
    public void runTrain() {
        System.out.println("Train is running on the railway...");
    }
}
