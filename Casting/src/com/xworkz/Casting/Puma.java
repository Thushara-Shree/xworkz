package com.xworkz.Casting;

import com.xworkz.external.Nike;
import com.xworkz.internal.CapBrand;

public class Puma {

    public  void brand(CapBrand capBrand){
        capBrand.price();
        capBrand.sell();
        capBrand.buy();
        capBrand.color();
        capBrand.manufacture();


        if(capBrand instanceof Nike){
            Nike nike=(Nike) capBrand;
            nike.buy();
        }
    }
}
