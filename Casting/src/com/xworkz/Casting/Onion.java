package com.xworkz.Casting;

import com.xworkz.external.Pumpkin;
import com.xworkz.internal.Vegetable;

public class Onion {

    public void taste(Vegetable vegetable){
        vegetable.soup();
        vegetable.fry();
        vegetable.dishes();
        vegetable.curry();
        vegetable.carving();


        if(vegetable instanceof Pumpkin){
            Pumpkin pumpkin=(Pumpkin) vegetable;
            pumpkin.carving();
        }
    }
}
