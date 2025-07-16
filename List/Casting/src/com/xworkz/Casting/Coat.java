package com.xworkz.Casting;

import com.xworkz.external.Jacket;
import com.xworkz.internal.BackCover;

public class Coat {

    public void color(BackCover backCover){
        backCover.theme();
        backCover.color();
        backCover.remove();
        backCover.addBackCover();
        backCover.material();

        if(backCover instanceof Jacket){
                Jacket jacket=(Jacket) backCover;
                jacket.color();
        }
    }
}
