package com.xworkz.Casting;

import com.xworkz.external.Frock;
import com.xworkz.internal.Cloth;

public class Jeans {

    public  void denim(Cloth cloth){
        cloth.size();
        cloth.fold();
        cloth.buy();
        cloth.price();
        cloth.color();


        if(cloth instanceof Frock){
            Frock frock=(Frock) cloth;
            frock.shine();
        }

    }
}
