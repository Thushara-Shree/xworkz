package com.xworkz.internal;

import com.xworkz.external.Computer;
import com.xworkz.external.Keyboard;

public class Device  implements Computer, Keyboard {

    @Override
    public void company() {
        System.out.println("Running in Company");
    }

    @Override
    public void cost() {
        System.out.println("Running in Company");
    }

    @Override
    public void model() {
        System.out.println("Running in Company");
    }

    @Override
    public void type() {
        System.out.println("Running in Company");
    }

    @Override
    public void clean() {
        System.out.println("Running in Company");
    }

    @Override
    public void pressKey() {
        System.out.println("Running in Company");
    }
}
