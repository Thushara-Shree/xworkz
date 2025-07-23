package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Transaction {

    public static void main(String args[]){

        Collection<Integer> noOfTimes=new ArrayList<>();
        noOfTimes.add(10);
        noOfTimes.add(9);
        noOfTimes.add(50);
        noOfTimes.add(90);
        noOfTimes.add(78);
        noOfTimes.add(45);
        noOfTimes.add(19);
        noOfTimes.add(66);
        noOfTimes.add(45);
        noOfTimes.add(98);

        System.out.println("The size is: "+noOfTimes.size());

        noOfTimes.clear();
        System.out.println("The size after clearing: "+noOfTimes.size());

        noOfTimes.add(10);
        noOfTimes.add(9);
        noOfTimes.add(50);
        noOfTimes.add(90);
        noOfTimes.add(78);
        noOfTimes.add(45);
        noOfTimes.add(19);
        noOfTimes.add(66);
        noOfTimes.add(45);
        noOfTimes.add(98);

        System.out.println("The updated size is: "+noOfTimes.size());

    }
}
