package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.LinkedIn;

public class Oppurtunity {

    LinkedIn linkedIn;

    public Oppurtunity(LinkedIn linkedIn){
        this.linkedIn=linkedIn;
        System.out.println("Running Oppurtunity Const");
    }

    public void job(){
        if(this.linkedIn!=null){
            this.linkedIn.connect();
        }
        else {
            System.out.println("null");
        }
    }
}
