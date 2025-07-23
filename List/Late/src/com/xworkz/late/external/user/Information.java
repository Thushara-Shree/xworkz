package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Mobile;

public class Information {

    Mobile mobile;

    public Information(Mobile mobile){
        this.mobile=mobile;
        System.out.println("Running Information const");
    }

    public void scroll(){
        if(this.mobile!=null){
            this.mobile.apps();
        }
        else
            System.out.println("Null");
    }
}
