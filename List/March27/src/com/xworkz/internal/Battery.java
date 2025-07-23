package com.xworkz.internal;

public class Battery {

    private String company;
    private char type;
    private Voltage voltage;

    public Battery(String company,char type,Voltage voltage){
        this.company=company;
        this.type=type;
        this.voltage=voltage;
    }

    public void displayBattery(){
        System.out.println("Running displayBattery in Battery");
        System.out.println("The battery company is: "+company);
        System.out.println("The type of battery is: "+type);
        this.voltage.displayVoltage();

    }
}
