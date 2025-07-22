package com.xworkz.Casting;

import com.xworkz.external.Leather;
import com.xworkz.internal.Belt;

public class ChainBelt {

    public  void material(Belt belt){
        belt.sell();
        belt.price();
        belt.color();
        belt.manufacture();
        belt.buy();

        if(belt instanceof Leather){
            Leather leather=(Leather) belt;
            leather.buy();
        }

    }
}
