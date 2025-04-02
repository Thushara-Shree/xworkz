package com.xworkz.external;

import com.xworkz.internal.Clothes;

public class Store extends Clothes {

    public Store(){
        super();
        System.out.println("Running store const");
    }

    public void location(){
        System.out.println("Running location in Store");
    }
}
