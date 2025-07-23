package com.xworkz.late.internal.imple;

public class StationImpl implements Station {

    public StationImpl() {
        System.out.println("StationImpl object created.");
    }

    @Override
    public void operate() {
        System.out.println("Operating the station...");
    }
}
