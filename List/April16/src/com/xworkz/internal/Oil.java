package com.xworkz.internal;

import com.xworkz.external.Parachute;

public class Oil implements Parachute {

    @Override
    public void smell() {
        System.out.println("Running smell in oil");
    }

    @Override
    public void use() {
        System.out.println("Running use in oil");
    }

    @Override
    public void quality() {
        System.out.println("Running quality in oil");
    }
}
