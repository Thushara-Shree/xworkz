package com.xworkz.internal;

import com.xworkz.external.Planet;
import com.xworkz.external.Red;

public class Mars implements Planet, Red {

    @Override
    public void paint() {

        System.out.println("Running in Mars");

    }

    @Override
    public void rotate() {
        System.out.println("Running in Mars");
    }

    @Override
    public void revolve() {
        System.out.println("Running in Mars");
    }

    @Override
    public void supportLife() {
        System.out.println("Running in Mars");
    }

    @Override
    public void brighten() {
        System.out.println("Running in Mars");
    }

    @Override
    public void fade() {
        System.out.println("Running in Mars");
    }
}
