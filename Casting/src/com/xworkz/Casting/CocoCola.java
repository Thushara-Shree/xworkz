package com.xworkz.Casting;

import com.xworkz.external.Pepsi;
import com.xworkz.internal.Coke;

public class CocoCola {

    public void taste(Coke coke){
        coke.color();
        coke.use();
        coke.price();
        coke.state();
        coke.buy();


        if(coke instanceof Pepsi){
            Pepsi pepsi=(Pepsi) coke;
            pepsi.brand();
        }
    }
}
