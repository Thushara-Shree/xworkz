package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Icc;

public class BCCI {

    Icc icc;

    public BCCI(Icc icc){

        this.icc=icc;
        System.out.printf("Running BCCI const");

    }

    public void play(){
        if(this.icc!=null){
            this.icc.fairPlay();
        }
        else
        {
            System.out.println("Pointing towards null ");
        }
    }
}
