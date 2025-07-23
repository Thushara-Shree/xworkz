package com.xworkz.Casting;

import com.xworkz.external.Food;
import com.xworkz.internal.Chips;

public class Lays {

    public void flavor(Chips chips){
        chips.spicy();
        chips.salty();
        chips.masala();
        chips.potato();
        chips.banana();

        if(chips instanceof Food){
            Food food=(Food)chips;
            food.banana();
        }
    }
}
