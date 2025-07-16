package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Vehicle;
import com.xworkz.late.internal.imple.VehicleImpl;

public class Engine {

    Vehicle vehicle;


    public Engine(Vehicle vehicle){
        this.vehicle=vehicle;
        System.out.println("Running Engine const");
    }

    public void tyre(){
        if (this.vehicle!=vehicle){
            this.vehicle.transport();
        }

        else {
            System.out.println("Null");
        }
    }
}
