package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Facebook;

public class Meta {

    Facebook facebook;

    public Meta(Facebook facebook){
        this.facebook=facebook;
        System.out.println("Running Meta const");
    }

    public void connect(){
        if(this.facebook!=null){
            this.facebook.message();
        }
        else
            System.out.println("Null");
    }
}
