package com.xworkz.late.internal.imple;

public class HarborImpl implements Harbor {

    public HarborImpl() {
        System.out.println("HarborImpl object created.");
    }

    @Override
    public void dock() {
        System.out.println("Docking at the harbor...");
    }
}