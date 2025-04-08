package com.xworkz.Casting;

import com.xworkz.external.Bag;
import com.xworkz.internal.Luggage;

public class Goods {

    public void weight(Luggage luggage){
        luggage.weight();
        luggage.type();
        luggage.location();
        luggage.load();
        luggage.location();

        if(luggage instanceof Bag){
            Bag bag=(Bag) luggage;
            bag.weight();
        }

    }
}
