package com.xworkz.internal;

import com.xworkz.external.Sparks;

public class FireworkSparks implements Sparks {

    @Override
    public void ignite() {
        System.out.println("Igniting the firework sparks.");
    }

    @Override
    public void fly() {
        System.out.println("The firework sparks are flying in the sky.");
    }

    @Override
    public void fadeOut() {
        System.out.println("The firework sparks are fading out.");
    }
}

