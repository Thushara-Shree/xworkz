package com.xworkz.internal;

public class PortType {

    private int noOFWire;
    private boolean plug;

    public PortType(int noOFWire,boolean plug){
        this.plug=plug;
        this.noOFWire=noOFWire;
    }

    public void Connect(){
        System.out.println("Running Connect in PortType");
        System.out.println("No of wire is: "+this.noOFWire);
        System.out.println("State of plug is: "+plug);
    }
}
