package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Bridge;

public class ConnectRoad {

    Bridge bridge;

    public ConnectRoad(Bridge bridge){
        this.bridge=bridge;
        System.out.println("Runnning ConnectRoad const");
    }

    public void landmark(){
        if (this.bridge!=null){
            this.bridge.road();
        }
        else
        {
            System.out.println("Null");
        }
    }
}
