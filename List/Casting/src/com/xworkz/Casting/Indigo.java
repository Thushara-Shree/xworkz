package com.xworkz.Casting;

import com.xworkz.external.Ink;
import com.xworkz.internal.Die;

public class Indigo {

    public void voilet(Die die){
        die.shade();
        die.stain();
        die.ratio();
        die.intensity();
        die.darkness();

        if(die instanceof Ink){
            Ink ink=(Ink) die;
            ink.color();
        }

    }
}
