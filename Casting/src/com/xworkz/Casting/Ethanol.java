package com.xworkz.Casting;

import com.xworkz.external.Beer;
import com.xworkz.internal.Alcohol;

public class Ethanol {

    public  void alcContent(Alcohol alcohol){

        alcohol.type();
        alcohol.Percentage();
        alcohol.price();
        alcohol.age();
        alcohol.brand();

        if(alcohol instanceof Beer){
            Beer beer=(Beer)alcohol;
            beer.age();
        }




    }
}
