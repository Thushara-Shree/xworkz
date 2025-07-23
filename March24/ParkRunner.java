package com.xworkz.March24;

import com.xworkz.March24_1.Flower;

public class ParkRunner {

    public static void main(String[] args) {

        Park park=new Park();
        Garden garden=new Garden(park);
        garden.displayPark();
        garden.RunPark();

        Flower flower=new Flower(park);
        flower.RunFlower();
    }
}
