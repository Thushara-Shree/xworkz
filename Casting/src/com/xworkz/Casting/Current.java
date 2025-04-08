package com.xworkz.Casting;

import com.xworkz.external.Electricity;
import com.xworkz.internal.Energy;

public class Current {

    public void shock(Energy energy){
        energy.strength();
        energy.wave();
        energy.force();
        energy.power();
        energy.unit();

        if(energy instanceof Electricity){
            Electricity electricity=(Electricity) energy;
            electricity.force();
        }


    }
}
