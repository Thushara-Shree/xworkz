package com.xworkz.late.internal.imple;

public class MobileImpl implements Mobile{

    public MobileImpl(){
        super();
        System.out.println("Running MobileImpl const");
    }

    @Override
    public void apps() {
        System.out.println("Running apps in MobileImpl");
    }
}
