package com.xworkz.Casting;

import com.xworkz.external.Syrup;
import com.xworkz.internal.Medicine;

public class Tablets {

    public void capsule(Medicine medicine){
        medicine.sell();
        medicine.buy();
        medicine.drink();
        medicine.price();
        medicine.apply();

        if(medicine instanceof Syrup){
            Syrup syrup=(Syrup) medicine;
            syrup.cure();
        }
    }
}
