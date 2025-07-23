package com.xworkz.collection.runner;

import com.xworkz.collection.dto.JuiceDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Juice {

    public static void main(String[] args) {

        Collection<JuiceDTO> details=new ArrayList<>();
        details.add(new JuiceDTO("Mango Juice", 50, "Fruit", "Mango", 10, "Yellow", "2025-08-01"));
        details.add(new JuiceDTO("Apple Juice", 60, "Fruit", "Apple", 5, "Light Yellow", "2025-09-15"));
        details.add(new JuiceDTO("Orange Juice", 55, "Citrus", "Orange", 8, "Orange", "2025-07-30"));
        details.add(new JuiceDTO("Carrot Juice", 45, "Vegetable", "Carrot", 7, "Orange", "2025-08-10"));
        details.add(new JuiceDTO("Pineapple Juice", 65, "Fruit", "Pineapple", 6, "Golden", "2025-10-01"));
        details.add(new JuiceDTO("Beetroot Juice", 70, "Vegetable", "Beetroot", 4, "Purple", "2025-07-25"));
        details.add(new JuiceDTO("Watermelon Juice", 40, "Fruit", "Watermelon", 9, "Red", "2025-08-05"));
        details.add(new JuiceDTO("Lemon Juice", 30, "Citrus", "Lemon", 12, "Light Yellow", "2025-07-20"));
        details.add(new JuiceDTO("Grape Juice", 75, "Fruit", "Grape", 6, "Dark Purple", "2025-08-18"));
        details.add(new JuiceDTO("Strawberry Juice", 80, "Fruit", "Strawberry", 3, "Pink", "2025-09-01"));


        for(JuiceDTO detail1:details){
            System.out.println(detail1.getName());
        }

        for(JuiceDTO detail1:details){
            System.out.println(detail1.getPrice());
        }

        for(JuiceDTO detail1:details){
            System.out.println(detail1.getType());
        }

        for(JuiceDTO detail1:details){
            System.out.println(detail1.getFlavor());
        }

        for(JuiceDTO detail1:details){
            System.out.println(detail1.getCount());
        }

        for(JuiceDTO detail1:details){
            System.out.println(detail1.getColor());
        }

        for(JuiceDTO detail1:details){
            System.out.println(detail1.getExpiryDate());
        }


    }
}
