package com.xworkz.internal;

import com.xworkz.external.Tap;

import javax.swing.plaf.TabbedPaneUI;

public class FaucetTap implements Tap {

    @Override
    public void turnOn() {
        System.out.println("Turning on the faucet tap.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the faucet tap.");
    }

    @Override
    public void drip() {
        System.out.println("The faucet tap is dripping.");
    }
}

