package com.xworkz.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Biscuit {

    public static void main(String[] args) {

        List<String> biscuitName=new ArrayList<>(Arrays.asList("Hide & Seek","Marie Gold","Oreo","Parle G",
                "Tiger","Monaco","Dark Fantasy","Milk Bikis","Crack Jack","Oreo"));

        ListIterator<String> biscuitIterator=biscuitName.listIterator();

        while (biscuitIterator.hasNext()){

            String biscuit=biscuitIterator.next();
            System.out.println("Biscuit Name: "+biscuit);

            if(biscuit.equals("Oreo")){
                biscuitIterator.add("Good Day");
            }
        }

        System.out.println("The biscuit names are: "+biscuitName);

    }
}
