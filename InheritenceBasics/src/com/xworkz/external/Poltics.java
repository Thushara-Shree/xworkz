package com.xworkz.external;

import com.xworkz.internal.Subject;

public class Poltics extends Subject {
    public Poltics(){
        super();
        System.out.println("Running const Poltics");
    }

    public void constitution(){
        System.out.println("Running Poltics in Poltics");
    }
}
