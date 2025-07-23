package com.xworkz.late.internal.imple;

public class OfficeImpl implements Office {

    public OfficeImpl() {
        System.out.println("OfficeImpl object created.");
    }

    @Override
    public void work() {
        System.out.println("Working in the office...");
    }
}

