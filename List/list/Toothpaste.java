package com.xworkz.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Toothpaste {

    public static void main(String[] args) {

        List<String>  name=new ArrayList<>(Arrays.asList("Vicco","Pepsodent","Dabur","Colgate","Sensodine","Patanjali","Aquafresh","Oral-B","Colgate"));

        ListIterator<String> listIterator=name.listIterator();

        while (listIterator.hasNext()){
            String pasteName=listIterator.next();
            System.out.println("ToothPaste Name : "+pasteName);
            if(pasteName.equals("Colgate")){
                listIterator.add("Crest");

            }

        }

        System.out.println(" Paste names are: "+name);



    }
}
