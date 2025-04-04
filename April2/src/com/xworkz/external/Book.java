package com.xworkz.external;

import com.xworkz.internal.Clothes;
import com.xworkz.internal.Store;

public class Book extends Store {

    public Book(){
        super();
        System.out.println("Running store const");
    }

    public void location(){
        System.out.println("Running location in Store");
    }
}
