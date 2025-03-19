package com.xworkz;

public class RCBWomen {

    public void jersey(RCB rcb){
        System.out.println("Running RCBWomen class");

        if(rcb!=null){
            rcb.cup();
        }
        else{
            System.out.println("Reference is pointing to null");
        }

    }
}
