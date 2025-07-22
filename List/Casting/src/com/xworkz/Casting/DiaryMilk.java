package com.xworkz.Casting;

import com.xworkz.external.KitKat;
import com.xworkz.internal.Chocolate;

public class DiaryMilk {

    public void coco(Chocolate chocolate){
        chocolate.melt();
        chocolate.wrapChocolate();
        chocolate.makeChocolate();
        chocolate.eatChocolate();
        chocolate.buyChocolate();

        if(chocolate instanceof KitKat){
            KitKat kitKat=(KitKat) chocolate;
            kitKat.taste();
        }
    }
}
