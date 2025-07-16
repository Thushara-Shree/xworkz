package com.xworkz.internal;

import com.xworkz.external.Art;

public class Artist implements Art {

    @Override
    public void draw() {
        System.out.println("The artist is drawing with a pencil.");
    }

    @Override
    public void paint() {
        System.out.println("The artist is painting a landscape.");
    }

    @Override
    public void sculpt() {
        System.out.println("The artist is sculpting a clay model.");
    }

    @Override
    public void create() {
        Art.super.create();
    }
}

