package com.xworkz.Casting;

import com.xworkz.external.Doms;
import com.xworkz.internal.Eraser;

public class BerryEraser {

    public void color(Eraser eraser){
        eraser.color();
        eraser.use();
        eraser.price();
        eraser.buy();
        eraser.eraser();


        if(eraser instanceof Doms){
            Doms doms=(Doms) eraser;
            doms.dust();
        }
    }
}
