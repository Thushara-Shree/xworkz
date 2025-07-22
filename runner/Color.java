package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Color {

    public static void main(String[] args){

        Collection<String> name=new ArrayList<>();
        name.add("red");
        name.add("yellow");
        name.add("green");
        name.add("blue");
        name.add("purple");
        name.add("black");
        name.add("pink");
        name.add("grey");
        name.add("brown");
        name.add("silver");

        System.out.println("The size is: "+name.size());
        name.clear();
        System.out.println("The size after clearing: "+name.size() );

        name.add("maroon");
        name.add("gold");
        name.add("light green");
        name.add("light blue");
        name.add("light purple");
        name.add("black");
        name.add("light pink");
        name.add("grey");
        name.add("light brown");
        name.add("silver");

        System.out.println("The updated size is: "+name.size());


    }
}
