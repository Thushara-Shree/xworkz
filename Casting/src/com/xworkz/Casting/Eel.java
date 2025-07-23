package com.xworkz.Casting;

import com.xworkz.external.Water;
import com.xworkz.internal.Fish;

public class Eel {

    public void fin(Fish fish){

        fish.fishType();
        fish.fishFood();
        fish.fishCost();
        fish.fishAquarium();
        fish.fishColor();

        if(fish instanceof Water){
            Water water=(Water)fish;
            water.density();
        }

    }
}
