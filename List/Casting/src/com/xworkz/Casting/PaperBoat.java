package com.xworkz.Casting;

import com.xworkz.external.Slice;
import com.xworkz.internal.Juice;

public class PaperBoat {

    public void brand(Juice juice){
        juice.mango();
        juice.ad();
        juice.taste();
        juice.company();
        juice.flavor();


        if(juice instanceof Slice){

            Slice slice=(Slice) juice;
            slice.company();

        }
    }
}
