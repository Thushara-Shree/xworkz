package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Mobile {

    public static void main(String[] args){

        Collection<String> brands=new ArrayList<>();
        brands.add("Samsung");
        brands.add("Motorola");
        brands.add("Poco");
        brands.add("Nokia");
        brands.add("Apple");
        brands.add("Vivo");
        brands.add("Oppo");
        brands.add("Xiomi");
        brands.add("Redmi");
        brands.add("Realme");

        System.out.println("The size is: "+brands.size());

        brands.clear();
        System.out.println("The size after clearing: "+brands.size());

        brands.add("Samsung");
        brands.add("Motorola");
        brands.add("Poco");
        brands.add("Nokia");
        brands.add("Apple");
        brands.add("Vivo");
        brands.add("Oppo");
        brands.add("Xiomi");
        brands.add("Redmi");
        brands.add("Realme");
        System.out.println("The updated size is: "+brands.size());


    }
}
