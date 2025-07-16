package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Laptop;

public class OperatingSystem {

    Laptop laptop;

    public OperatingSystem(Laptop laptop){
        this.laptop=laptop;
        System.out.println("Running OperatingSystem const");
    }

    public void feature(){
       if (this.laptop!=null){
           this.laptop.process();
       }
       else
           System.out.println("Null");
    }
}
