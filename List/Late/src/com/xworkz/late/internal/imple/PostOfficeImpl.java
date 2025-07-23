package com.xworkz.late.internal.imple;

public class PostOfficeImpl implements PostOffice{

    public PostOfficeImpl(){
        super();
        System.out.println("Running PostOfficeImpl const");
    }

    @Override
    public void Letters() {
        System.out.println("Running letters in PostOfficeImpl");
    }
}
