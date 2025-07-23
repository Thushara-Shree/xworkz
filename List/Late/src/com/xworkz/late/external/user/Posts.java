package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.PostOffice;

public class Posts {

    PostOffice postOffice;

    public Posts(PostOffice postOffice){
        this.postOffice=postOffice;
        System.out.println("Running Posts Const");

    }

    public void message(){
        if (this.postOffice!=null){
            this.postOffice.Letters();
        }
        else {
            System.out.println("Null");
        }
    }
}
