package com.xworkz.late.internal.imple;

public class InternetImpl implements Internet {

    public InternetImpl() {
        System.out.println("InternetImpl object created.");
    }

    @Override
    public void browse() {
        System.out.println("Browsing the internet...");
    }
}
