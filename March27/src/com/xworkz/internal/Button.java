package com.xworkz.internal;

public class Button {

    private int noOfButtons;
    private Material material;

    public Button(int noOfButtons,Material material){
        this.noOfButtons=noOfButtons;
        this.material=material;
    }

    public void displayButton(){
        System.out.println("Running displayButton in Button");
        System.out.println("Number of buttons are: "+this.noOfButtons);
        this.material.displayMaterial();
    }


}
