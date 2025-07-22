package com.xworkz.late.internal.imple;

public class FacebookImpl implements Facebook{

    public FacebookImpl(){
        super();
        System.out.println("Running FacebookImpl const");
    }

    @Override
    public void message() {
        System.out.println("Running message in FacebookImpl");
    }
}
