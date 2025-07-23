package com.xworkz.internal;

import com.xworkz.external.Gum;

public class ChewingGum implements Gum {

    @Override
    public void chew() {
        System.out.println("Chewing the gum.");
    }

    @Override
    public void blowBubble() {
        System.out.println("Blowing a bubble with the gum.");
    }

    @Override
    public void spitOut() {
        System.out.println("Spitting out the gum.");
    }

    @Override
    public void bite() {
        Gum.super.bite();
    }
}

