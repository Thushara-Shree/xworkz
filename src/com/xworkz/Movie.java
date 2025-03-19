package com.xworkz;

public class Movie {
    public void language(Theater theater){
        System.out.println("Running movie class");

        if(theater!=null) {
            theater.popcorn();
        }
        else{
            System.out.println("Reference is pointing to null");
        }

        }

    }

