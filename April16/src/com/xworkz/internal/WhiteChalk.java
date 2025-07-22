package com.xworkz.internal;

import com.xworkz.external.Chalk;

public class WhiteChalk implements Chalk {

    @Override
    public void write() {
        System.out.println("Writing on the blackboard with the white chalk.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the chalk marks from the blackboard.");
    }

    @Override
    public void breakIt() {
        System.out.println("The chalk broke while writing.");
    }
}

