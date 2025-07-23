package com.xworkz.Casting;

import com.xworkz.external.Lenovo;
import com.xworkz.internal.Laptop;


public class Dell {

    public void validity(Laptop laptop){

        laptop.movie();
        laptop.ppt();
        laptop.games();
        laptop.display();
        laptop.portable();

        if(laptop instanceof Lenovo){
            Lenovo lenovo=(Lenovo)laptop;
            lenovo.display();

        }

    }
}
