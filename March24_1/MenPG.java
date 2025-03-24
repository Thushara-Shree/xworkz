package com.xworkz.March24_1;

import com.xworkz.March24.PG;

public class MenPG {

    PG pg;

    public MenPG(PG pg){
        this.pg=pg;
    }

    public  void menPGRunner(){
        if(pg!=null)
        this.pg.floor();
        System.out.println("The location og PG is: "+this.pg.location);
    }
}
