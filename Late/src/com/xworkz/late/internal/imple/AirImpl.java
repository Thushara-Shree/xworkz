package com.xworkz.late.internal.imple;

public class AirImpl implements Air {

    public AirImpl() {
        System.out.println("AirImpl object created.");
    }

    @Override
    public void circulate() {
        System.out.println("Air is circulating...");
    }
}
