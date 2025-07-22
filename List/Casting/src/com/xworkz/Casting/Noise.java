package com.xworkz.Casting;

import com.xworkz.external.Philips;
import com.xworkz.internal.IronBox;

public class Noise {

    public void heat(IronBox ironBox){
        ironBox.price();
        ironBox.sell();
        ironBox.iron();
        ironBox.color();
        ironBox.buy();

        if(ironBox instanceof Philips){
            Philips philips=(Philips) ironBox;
            philips.straighten();
        }
    }
}
