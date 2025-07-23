package com.xworkz.internal;

import com.xworkz.external.Dress;

public class EveningDress implements Dress {

    @Override
    public void wear() {
        System.out.println("Wearing the evening dress.");
    }

    @Override
    public void remove() {
        System.out.println("Removing the evening dress.");
    }

    @Override
    public void iron() {
        System.out.println("Ironing the evening dress.");
    }

    @Override
    public void code() {
        Dress.super.code();
    }
}

