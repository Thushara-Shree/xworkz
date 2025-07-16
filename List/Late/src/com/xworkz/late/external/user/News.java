package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Mobile;
import com.xworkz.late.internal.imple.Newspaper;

public class News {

    Newspaper newspaper;

    public News( Newspaper newspaper){
        this.newspaper=newspaper;
        System.out.println("Running  Newspaper  const");
    }

    public void scroll(){
        if(this.newspaper!=null){
            this.newspaper.headlines();
        }
        else
            System.out.println("Null");
    }
}
