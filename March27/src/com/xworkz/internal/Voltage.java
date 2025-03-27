package com.xworkz.internal;

public class Voltage {

    private int volt;
    private int current;

    public  Voltage(int volt,int current){
        this.volt=volt;
        this.current=current;
    }

    public void displayVoltage(){
        System.out.println("Running display Voltage in Voltage");
        System.out.println("The volt is: "+this.volt);
        System.out.println("The current is: "+this.volt);
    }

}
