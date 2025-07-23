package com.xworkz.internal;

import com.xworkz.external.Comb;

public class HairComb implements Comb {

    @Override
    public void untangle() {
        System.out.println("Untangling the hair with the comb.");
    }

    @Override
    public void style() {
        System.out.println("Styling the hair with the comb.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the comb.");
    }
}
