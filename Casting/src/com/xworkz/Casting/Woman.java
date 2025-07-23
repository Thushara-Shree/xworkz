package com.xworkz.Casting;

import com.xworkz.external.Man;
import com.xworkz.internal.LivingBeing;

public class Woman {

    public void freedom(LivingBeing livingBeing){

        livingBeing.talk();
        livingBeing.eat();
        livingBeing.sleep();
        livingBeing.help();
        livingBeing.breath();

        if(livingBeing instanceof Man){
            Man man=(Man) livingBeing;
            man.breath();
        }

    }
}
