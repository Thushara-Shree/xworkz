package com.xworkz.Casting;

import com.xworkz.external.Bharatanatyam;
import com.xworkz.internal.Dance;

public class Ballet {

    public void shoes(Dance dance){
        dance.teach();
        dance.practice();
        dance.perform();
        dance.compitation();
        dance.learn();

        if(dance instanceof Bharatanatyam){
            Bharatanatyam bharatanatyam=(Bharatanatyam) dance;
            bharatanatyam.costume();
        }
    }
}
