package com.xworkz.late.internal.imple;

public class CitizenConstImpl implements Constitution{

    public CitizenConstImpl(){
        super();
        System.out.println("Running CitizenConstImpl const");
    }

    @Override
    public void followLaws() {
        System.out.println("Running follow Laws in CitizenConstImpl");
    }
}
