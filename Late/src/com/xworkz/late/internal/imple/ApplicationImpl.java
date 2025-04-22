package com.xworkz.late.internal.imple;

public class ApplicationImpl implements Application{

    public ApplicationImpl(){
        super();
        System.out.println("Running ApplicationImpl const");
    }

    @Override
    public void version() {
        System.out.println("Running version in ApplicationImpl");
    }
}
