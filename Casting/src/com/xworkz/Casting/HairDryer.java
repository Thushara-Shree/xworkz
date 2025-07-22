package com.xworkz.Casting;

import com.xworkz.external.Computer;
import com.xworkz.internal.Coke;
import com.xworkz.internal.Device;

public class HairDryer {

    public void heat(Device device){

        device.name();
        device.plug();
        device.deviceType();
        device.port();
        device.charger();


        if(device instanceof Computer){
            Computer computer=(Computer)device;
            computer.charger();
        }

    }
}
