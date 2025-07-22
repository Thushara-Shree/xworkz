package com.xworkz.internal;

import com.xworkz.external.Alien;

public class Martian implements Alien {

    @Override
    public void communicate() {
        System.out.println("The Martian is communicating telepathically.");
    }

    @Override
    public void invade() {
        System.out.println("The Martian is preparing to invade Earth.");
    }

    @Override
    public void disguise() {
        System.out.println("The Martian is disguising itself as a human.");
    }
}

