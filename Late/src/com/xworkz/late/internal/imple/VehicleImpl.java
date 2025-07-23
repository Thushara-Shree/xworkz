package com.xworkz.late.internal.imple;

public class VehicleImpl implements Vehicle{

    public VehicleImpl(){
        super();
        System.out.println("Running VehicleImpl const");
    }

    @Override
    public void transport() {
        System.out.println("Running transport in VehicleImpl");
    }
}
