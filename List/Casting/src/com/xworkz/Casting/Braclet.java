package com.xworkz.Casting;

import com.xworkz.external.Chain;
import com.xworkz.internal.Accessories;

public class Braclet {

    public void ruby(Accessories accessories){
        accessories.wear();
        accessories.color();
        accessories.sell();
        accessories.buy();
        accessories.prepare();


        if(accessories instanceof Chain){
            Chain chain=(Chain) accessories;
            chain.beed();

        }

    }
}
