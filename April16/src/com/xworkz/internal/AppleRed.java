package com.xworkz.internal;

import com.xworkz.external.Red;

public class AppleRed implements Red {

    @Override
    public void brighten() {
        System.out.println("The red color is brightening.");
    }

    @Override
    public void fade() {
        System.out.println("The red color is fading.");
    }

    @Override
    public void paint() {
        System.out.println("Painting with red color.");
    }
}
