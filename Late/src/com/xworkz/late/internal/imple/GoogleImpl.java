package com.xworkz.late.internal.imple;

public class GoogleImpl implements Google {

    public GoogleImpl() {
        System.out.println("GoogleImpl object created.");
    }

    @Override
    public void search() {
        System.out.println("Searching on Google...");
    }
}

