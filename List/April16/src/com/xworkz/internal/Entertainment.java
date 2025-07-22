package com.xworkz.internal;

import com.xworkz.external.Cartoon;
import com.xworkz.external.Computer;

public class Entertainment implements Cartoon, Computer {

    @Override
    public void cost() {
        System.out.println("Running in Entertainment");

    }

    @Override
    public void model() {
        System.out.println("Running in Entertainment");
    }

    @Override
    public void company() {
        System.out.println("Running in Entertainment");
    }

    @Override
    public void animate() {
        System.out.println("Running in Entertainment");
    }

    @Override
    public void draw() {
        System.out.println("Running in Entertainment");
    }

    @Override
    public void display() {
        System.out.println("Running in Entertainment");
    }


}
