package com.xworkz.external;



public class Book extends Store {

    public Book(){
        super();
        System.out.println("Running store const");
    }

    public void location(){
        System.out.println("Running location in Store");
    }
}
