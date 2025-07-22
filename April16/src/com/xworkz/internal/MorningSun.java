package com.xworkz.internal;

import com.xworkz.external.Sun;

public class MorningSun implements Sun {

    @Override
    public void shine() {
        System.out.println("The sun is shining brightly.");
    }

    @Override
    public void set() {
        System.out.println("The sun is setting.");
    }

    @Override
    public void rise() {
        System.out.println("The sun is rising.");
    }
}
