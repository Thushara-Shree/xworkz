package com.xworkz.internal;

public class Capacitor {

    private int capacitance;
    private int resistance;

    public Capacitor(int capacitance,int resistance){
        this.capacitance=capacitance;
        this.resistance=resistance;

    }

    public  void displayCapacitor(){
        System.out.println("Running display Capacitor in Capacitor");
        System.out.println("The capacitance of Capacitor is: "+this.capacitance);
        System.out.println("The resistance of Capacitor is: "+this.resistance);
    }
}
