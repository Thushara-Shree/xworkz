package com.xworkz.Casting;

import com.xworkz.external.Soap;
import com.xworkz.internal.BodyWash;

public class Shampoo {

    public void conditioner(BodyWash bodyWash){
        bodyWash.color();
        bodyWash.sell();
        bodyWash.buy();
        bodyWash.price();
        bodyWash.apply();


        if(bodyWash instanceof Soap){
            Soap soap=(Soap)bodyWash;
            soap.buy();
        }
    }
}
