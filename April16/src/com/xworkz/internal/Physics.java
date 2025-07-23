package com.xworkz.internal;

import com.xworkz.external.Science;

public class Physics implements Science {

    @Override
    public void experiment() {
        System.out.println("Conducting an experiment in physics.");
    }

    @Override
    public void research() {
        System.out.println("Researching a topic in physics.");
    }

    @Override
    public void discover() {
        System.out.println("Discovering new principles in physics.");
    }
}
