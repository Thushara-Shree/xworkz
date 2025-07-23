package com.xworkz.internal;

import com.xworkz.external.Road;

public class Highway implements Road {

    @Override
    public void construct() {
        System.out.println("Constructing a new highway.");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining the highway for smooth traffic.");
    }

    @Override
    public void closeForRepairs() {
        System.out.println("Closing the highway for repairs.");
    }
}
