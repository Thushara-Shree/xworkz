package com.xworkz.Casting;

import com.xworkz.external.Holi;
import com.xworkz.internal.Festival;

public class Eid {

    public void biriyani(Festival festival){
        festival.ritual();
        festival.eatSweets();
        festival.decoration();
        festival.celebrate();
        festival.holiday();

        if(festival instanceof Holi){
            Holi holi=(Holi) festival;
            holi.vacation();
        }
    }
}
