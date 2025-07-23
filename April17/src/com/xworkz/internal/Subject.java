package com.xworkz.internal;

import com.xworkz.external.Science;
import com.xworkz.external.Social;

public class Subject implements Science, Social {

    @Override
    public void interact() {
        System.out.println("Running Subject");
    }

    @Override
    public void helpOthers() {
        System.out.println("Running Subject");
    }

    @Override
    public void organizeEvent() {
        System.out.println("Running Subject");
    }

    @Override
    public void discover() {
        System.out.println("Running Subject");
    }

    @Override
    public void experiment() {
        System.out.println("Running Subject");
    }

    @Override
    public void research() {
        System.out.println("Running Subject");
    }
}
