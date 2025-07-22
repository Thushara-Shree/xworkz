package com.xworkz.late.internal.imple;

public class ChargerImpl implements Charger {

    public ChargerImpl() {
        System.out.println("ChargerImpl object created.");
    }

    @Override
    public void charge() {
        System.out.println("Charging the device...");
    }
}
