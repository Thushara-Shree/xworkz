package com.xworkz.late.internal.imple;

public class LaptopImpl implements Laptop{

    public LaptopImpl(){
        super();
        System.out.println("Running LaptopImpl const");
    }

    @Override
    public void process() {
        System.out.println("Running process in LaptopImpl");

    }
}
