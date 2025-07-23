package com.xworkz.internal;

import com.xworkz.external.Gold;

public class Silver implements Gold {

    @Override
    public void cost() {
        System.out.println("Running cost in Silver");
    }

    @Override
    public void extract() {
        System.out.println("Running extract in Silver");
    }

    @Override
    public void jewellery() {
        System.out.println("Running jewellery in Silver");
    }
}
