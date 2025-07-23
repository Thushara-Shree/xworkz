package com.xworkz.internal;

import com.xworkz.external.Star;

public class SunStar implements Star {

    @Override
    public void shine() {
        System.out.println("The Sun is shining brightly.");
    }

    @Override
    public void twinkle() {
        System.out.println("The Sun doesn't twinkle, but stars do.");
    }

    @Override
    public void explode() {
        System.out.println("Eventually, the Sun will explode in a supernova.");
    }

    @Override
    public void infinte() {
        Star.super.infinte();
    }
}

