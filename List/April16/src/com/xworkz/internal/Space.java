package com.xworkz.internal;

import com.xworkz.external.Moon;
import com.xworkz.external.Planet;

public class Space implements Planet, Moon {

    @Override
    public void orbit() {
        System.out.println("Running Space");
    }

    @Override
    public void reflect() {
        System.out.println("Running Space");
    }

    @Override
    public void revolve() {
        System.out.println("Running Space");
    }

    @Override
    public void rotate() {
        System.out.println("Running Space");
    }

    @Override
    public void shine() {
        System.out.println("Running Space");
    }

    @Override
    public void supportLife() {
        System.out.println("Running Space");
    }
}
