package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Constitution;

public class Government {

    Constitution constitution;

    public Government(Constitution constitution){
        this.constitution=constitution;
        System.out.println("Running govt const");
    }

    public void rule(){
      if(this.constitution!=null){
         this.constitution.followLaws();
      }
      else
          System.out.println("Null");
    }
}
