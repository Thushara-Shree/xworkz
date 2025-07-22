package com.xworkz.late.internal.imple;


public class PaperImpl implements Paper {

    public PaperImpl() {
        System.out.println("PaperImpl object created.");
    }

    @Override
    public void write() {
        System.out.println("Writing on the paper...");
    }
}