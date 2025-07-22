package com.xworkz.Casting;

import com.xworkz.external.Plastic;
import com.xworkz.internal.Bottle;

public class TupperWare {

    public void pet(Bottle bottle){
        bottle.fill();
        bottle.openBottle();
        bottle.closeBottle();
        bottle.manufacture();
        bottle.fill();

        if(bottle instanceof Plastic){
            Plastic plastic=(Plastic) bottle;
            plastic.color();
        }
    }
}
