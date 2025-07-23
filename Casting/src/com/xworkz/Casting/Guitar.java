package com.xworkz.Casting;

import com.xworkz.external.Keyboard;
import com.xworkz.internal.Instrument;

public class Guitar {

    public void cost(Instrument instrument){
        instrument.tune();
        instrument.cost();
        instrument.string();
        instrument.key();
        instrument.chord();

        if(instrument instanceof Keyboard){
            Keyboard keyboard=(Keyboard)instrument;
            keyboard.cost();
        }

    }
}
