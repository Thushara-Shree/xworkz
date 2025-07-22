package com.xworkz.internal;

import com.xworkz.external.Tin;

public class Container implements Tin {

    @Override
    public void cost() {
        System.out.println("Running cost in Container");
    }

    @Override
    public void use() {
        System.out.println("Running use in Container");
    }

    @Override
    public void store() {
        System.out.println("Running store in Container");
    }
}
