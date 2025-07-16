package com.xworkz.late.internal.imple;


public class CableImpl implements Cable {

    public CableImpl() {
        System.out.println("CableImpl object created.");
    }

    @Override
    public void transmitSignal() {
        System.out.println("Transmitting signal through the cable...");
    }
}
