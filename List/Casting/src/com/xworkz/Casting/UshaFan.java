package com.xworkz.Casting;

import com.xworkz.external.Vguard;
import com.xworkz.internal.Fan;

public class UshaFan {

    public void air(Fan fan){
        fan.rotate();
        fan.price();
        fan.buy();
        fan.brand();
        fan.color();

        if(fan instanceof Vguard){
            Vguard vguard=(Vguard) fan;
            vguard.breeze();
        }
    }
}
