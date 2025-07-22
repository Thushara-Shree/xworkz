package com.xworkz.internal;

public class EnumProperty {

    private String name;
    private Instruments instruments;

    public EnumProperty(String name,Instruments instruments){
        this.name=name;
        this.instruments=instruments;

    }

    public  void displayEnumProperty(){
        System.out.println("Running displayEnum Property in EnumProperty");
        System.out.println("The name is: "+name);
        System.out.println(" cost: "+this.instruments.getCost());
        System.out.println("Chord: "+this.instruments.getChord());
    }

}

