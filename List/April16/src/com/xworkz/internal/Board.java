package com.xworkz.internal;

import com.xworkz.external.Art;
import com.xworkz.external.Chalk;

public class Board implements Art, Chalk {

    @Override
    public void write() {
        System.out.println("Running in Board");

    }

    @Override
    public void draw() {
        System.out.println("Running in Board");
    }

    @Override
    public void erase() {
        System.out.println("Running in Board");
    }

    @Override
    public void breakIt() {
        System.out.println("Running in Board");
    }

    @Override
    public void paint() {
        System.out.println("Running in Board");
    }

    @Override
    public void sculpt() {
        System.out.println("Running in Board");
    }


}
