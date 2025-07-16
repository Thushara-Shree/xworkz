package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Application;

public class UserNeed {

    Application application;

    public UserNeed(Application application){
        this.application=application;
        System.out.println("Running UserNeed const");
    }

    public void play(){
        if (this.application!=null){
            this.application.version();
        }
        else {
            System.out.println("Null");
        }
    }
}
