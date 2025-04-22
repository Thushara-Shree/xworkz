package com.xworkz.late.internal.imple;

public class MetroImpl implements Metro {

    public MetroImpl() {
        System.out.println("MetroImpl object created.");
    }

    @Override
    public void travel() {
        System.out.println("Traveling by metro...");
    }
}
