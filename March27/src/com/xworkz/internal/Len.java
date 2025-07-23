package com.xworkz.internal;

public class Len {

    private int pixels;
    private int cost;

    public Len(int pixels,int cost){
        this.pixels=pixels;
        this.cost=cost;
    }

    public void clarity(){
        System.out.println("Running clarity inside Len");
        System.out.println("The Lens pixels is: "+this.pixels);
        System.out.println("The cost is: "+this.cost);


    }


}
