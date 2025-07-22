package com.xworkz.internal;

import com.xworkz.external.Church;

public class ChristianChurch implements Church {

    @Override
    public void openDoors() {
        System.out.println("Opening the church doors.");
    }

    @Override
    public void holdService() {
        System.out.println("Holding a church service.");
    }

    @Override
    public void closeDoors() {
        System.out.println("Closing the church doors.");
    }
}

