package com.xworkz.internal;

import com.xworkz.external.Sunscreen;

public class SPFSunscreen implements Sunscreen {

    @Override
    public void apply() {
        System.out.println("Applying sunscreen to the skin.");
    }

    @Override
    public void protect() {
        System.out.println("Protecting skin from harmful UV rays.");
    }

    @Override
    public void remove() {
        System.out.println("Removing sunscreen after use.");
    }
}

