package com.xworkz.late.internal.imple;

public class RoadImpl implements Road {

    public RoadImpl() {
        System.out.println("RoadImpl object created.");
    }

    @Override
    public void travel() {
        System.out.println("Traveling on the road...");
    }
}

