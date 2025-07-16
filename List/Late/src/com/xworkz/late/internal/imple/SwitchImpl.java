package com.xworkz.late.internal.imple;

public class SwitchImpl implements Switch {

    public SwitchImpl() {
        System.out.println("SwitchImpl object created.");
    }

    @Override
    public void turnOn() {
        System.out.println("Switch is turned on.");
    }
}
