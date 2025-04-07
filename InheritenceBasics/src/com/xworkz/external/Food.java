package com.xworkz.external;

import com.xworkz.internal.Chips;

public class Food  extends Chips {

    public Food(){
        super();
        System.out.println("Running Food const");
    }

    public void flavor(){
        System.out.println("Running flavor in food");
    }
}
