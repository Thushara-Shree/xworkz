package com.xworkz.March24_1;

import com.xworkz.March24.Park;

public class Flower {

    Park park;

    public Flower(Park park){
        this.park=park;
    }

    public void RunFlower() {
        if (this.park != null) {
            this.park.Swing();
        }
        System.out.println("The status of entry is :"+this.park.entry);
    }


    }

