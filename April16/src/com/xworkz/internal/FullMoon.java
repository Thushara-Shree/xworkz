package com.xworkz.internal;

import com.xworkz.external.Moon;

public class FullMoon implements Moon {

    @Override
    public void shine() {
        System.out.println("The full moon is shining brightly.");
    }

    @Override
    public void reflect() {
        System.out.println("The full moon reflects the light from the sun.");
    }

    @Override
    public void orbit() {
        System.out.println("The full moon is orbiting the Earth.");
    }
}

