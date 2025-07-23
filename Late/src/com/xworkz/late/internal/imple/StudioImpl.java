package com.xworkz.late.internal.imple;

public class StudioImpl implements Studio {

    public StudioImpl() {
        System.out.println("StudioImpl object created.");
    }

    @Override
    public void record() {
        System.out.println("Recording in the studio...");
    }
}
