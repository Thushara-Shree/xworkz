package com.xworkz.internal;

public class Remote {

    private String use;
    private Battery battery;

    public Remote(String use,Battery battery){
        this.use=use;
        this.battery=battery;
    }

    public void displayRemote(){
        System.out.println("Running displayRemote in Remote");
        System.out.println("The use of remote is in: "+this.battery );
        this.battery.displayBattery();
    }

}
