package com.xworkz.internal;

import com.xworkz.external.Gun;

public class Pistol implements Gun {

    @Override
    public void load() {
        System.out.println("Loading the pistol.");
    }

    @Override
    public void fire() {
        System.out.println("Firing the pistol.");
    }

    @Override
    public void reload() {
        System.out.println("Reloading the pistol.");
    }
}

