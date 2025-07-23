package com.xworkz.Casting;

import com.xworkz.external.Connector;
import com.xworkz.internal.Charger;

public class Port {

    public  void type(Charger charger){
        charger.remove();
        charger.price();
        charger.color();
        charger.plugIn();
        charger.capacity();


        if(charger instanceof Connector){
            Connector connector=(Connector) charger;
            connector.load();
        }
    }
}
