package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Food {

    public static void main(String[] args){
        Collection<String> foodName=new ArrayList<>();
        foodName.add("Dosa");
        foodName.add("Idli");
        foodName.add("Biriyani");
        foodName.add("Pani Puri");
        foodName.add("Masala Puri");
        foodName.add("Rice");
        foodName.add("Curry");
        foodName.add("Ice Cream");
        foodName.add("Cake");
        foodName.add("Cookie");

        System.out.println("The size is: "+foodName.size());

        foodName.clear();
        System.out.println("The size after clearing: "+foodName.size());

        foodName.add("Dosa");
        foodName.add("Idli");
        foodName.add("Biriyani");
        foodName.add("Pani Puri");
        foodName.add("Masala Puri");
        foodName.add("Rice");
        foodName.add("Curry");
        foodName.add("Ice Cream");
        foodName.add("Cake");
        foodName.add("Cookie");

        System.out.println("The updated size is: "+foodName.size());

    }
}
