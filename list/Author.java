package com.xworkz.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Author {

    public static void main(String[] args) {

        List<String> authorName=new ArrayList<>(Arrays.asList("Enid Blyton",
                "Preeti Shenoy","Dan Brown","Jeff Kinely","R L Stine","Chetan Bhagath","Judy Bloom","J K Rowling","Ruskin Bond","Jeff Kinely"));

        ListIterator<String> nameIterator=authorName.listIterator();

        while (nameIterator.hasNext()){
            String names=nameIterator.next();
            System.out.println("Author name :"+names);
            if(names.equals("Jeff Kinely")){
                nameIterator.add("R K Roy");
            }


        }

        System.out.println("The author names are: "+authorName);
    }
}
