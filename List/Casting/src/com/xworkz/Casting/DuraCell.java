package com.xworkz.Casting;

import com.xworkz.external.EveryDay;
import com.xworkz.internal.Battery;

public class DuraCell {

    public void positive(Battery battery){
        battery.size();
        battery.plug();
        battery.price();
        battery.buy();
        battery.blast();

        if(battery instanceof EveryDay){
            EveryDay everyDay=(EveryDay) battery;
            everyDay.buy();
        }
    }
}
