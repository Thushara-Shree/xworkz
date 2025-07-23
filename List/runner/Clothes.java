package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Clothes {

    public static  void main(String[] args){

        Collection<String> types=new ArrayList<>();
        types.add("Jeans");
        types.add("Dress");
        types.add("Shirt");
        types.add("Robe");
        types.add("Frock");
        types.add("T-Shirt");
        types.add("Denim");
        types.add("NeckLine");
        types.add("Half Shoulder");
        types.add("Sleevless");

        System.out.println("The size is: "+types.size());

        types.clear();
        System.out.println("The size after clearing: "+types.size());

        types.add("Jeans");
        types.add("Dress");
        types.add("Shirt");
        types.add("Robe");
        types.add("Frock");
        types.add("T-Shirt");
        types.add("Denim");
        types.add("NeckLine");
        types.add("Half Shoulder");
        types.add("Sleevless");

        System.out.println("The updated size is: "+types.size());


    }
}
