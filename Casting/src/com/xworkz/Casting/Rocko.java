package com.xworkz.Casting;

import com.xworkz.external.Rangeela;
import com.xworkz.internal.ColorPencil;

public class Rocko {

    public void quality(ColorPencil colorPencil){
        colorPencil.color();
        colorPencil.write();
        colorPencil.buy();
        colorPencil.use();
        colorPencil.price();

        if(colorPencil instanceof Rangeela){
            Rangeela rangeela=(Rangeela) colorPencil;
            rangeela.stationary();
        }
    }
}
