package com.xworkz.internal;

import com.xworkz.external.Steel;

public class StainlessSteel implements Steel {

    @Override
    public void melt() {
        System.out.println("Melting the stainless steel.");
    }

    @Override
    public void shape() {
        System.out.println("Shaping the stainless steel.");
    }

    @Override
    public void cool() {
        System.out.println("Cooling the stainless steel.");
    }

    @Override
    public void hard() {
        Steel.super.hard();
    }
}
