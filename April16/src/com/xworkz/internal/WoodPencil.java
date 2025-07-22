package com.xworkz.internal;

import com.xworkz.external.Pencil;

public class WoodPencil implements Pencil {

    @Override
    public void write() {
        System.out.println("Writing with a wooden pencil.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing with the eraser on the pencil.");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the wooden pencil.");
    }
}

