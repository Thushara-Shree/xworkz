package com.xworkz.internal;

import com.xworkz.external.Ghee;
import com.xworkz.external.Gum;

public class Taste implements Gum, Ghee {

    @Override
    public void flavor() {
        System.out.println("Running in Taste");

    }

    @Override
    public void chew() {
        System.out.println("Running in Taste");
    }

    @Override
    public void cook() {
        System.out.println("Running in Taste");
    }

    @Override
    public void melt() {
        System.out.println("Running in Taste");
    }

    @Override
    public void blowBubble() {
        System.out.println("Running in Taste");
    }

    @Override
    public void spitOut() {
        System.out.println("Running in Taste");
    }
}
