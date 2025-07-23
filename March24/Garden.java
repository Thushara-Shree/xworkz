package com.xworkz.March24;

public class Garden {

    Park park;

    public Garden(Park park){
        this.park=park;
    }

    public void RunPark(){
        if(this.park!=null) {
            this.park.Swing();
        }
        System.out.println(this.park.entry);
    }

    public  void displayPark(){
        if(this.park!=null) {
            this.park.SeaSaw();
        }
        System.out.println(this.park.plants);

    }
}
