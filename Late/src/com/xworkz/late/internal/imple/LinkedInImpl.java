package com.xworkz.late.internal.imple;

public class LinkedInImpl implements  LinkedIn{

    public LinkedInImpl(){
        super();
        System.out.println("Running LinkedInImpl const");
    }

    @Override
    public void connect() {
        System.out.println("Running connect in LinkedInImpl ");
    }
}
