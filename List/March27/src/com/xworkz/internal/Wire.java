package com.xworkz.internal;

public class Wire {

    private String wireColor;
    private Quality quality;

    public Wire(String wireColor,Quality quality){
        this.wireColor=wireColor;
        this.quality=quality;
    }

    public void Insulator(){
        System.out.println("Running insulator inside wire");
        System.out.println("The color of wire is: "+this.wireColor);
        this.quality.displayQuality();
    }
}
