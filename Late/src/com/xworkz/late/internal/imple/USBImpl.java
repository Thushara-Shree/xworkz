package com.xworkz.late.internal.imple;

public class USBImpl implements USB {

    public USBImpl() {
        System.out.println("USBImpl object created.");
    }

    @Override
    public void transferData() {
        System.out.println("Transferring data through USB...");
    }
}
