package com.xworkz.internal;

public class Port {

    private String connector;
    private PortType type;

    public Port(String connector,PortType type)
    {
        this.connector=connector;
        this.type=type;
    }

    public void displayPort(){
        System.out.println("Running displayPort in Port");
        System.out.println("The type of connector is: "+connector);
        this.type.Connect();
    }

}
