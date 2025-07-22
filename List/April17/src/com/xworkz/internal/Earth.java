package com.xworkz.internal;

import com.xworkz.external.Planet;

public class Earth implements Planet {

    @Override
    public void rotate() {
        System.out.println("The Earth is rotating on its axis.");
    }

    @Override
    public void revolve() {
        System.out.println("The Earth is revolving around the Sun.");
    }

    @Override
    public void supportLife() {
        System.out.println("The Earth supports life.");
    }

    @Override
    public void life() {
        Planet.super.life();
    }
}
