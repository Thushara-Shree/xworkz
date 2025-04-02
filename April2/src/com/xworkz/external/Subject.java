package com.xworkz.external;

import com.xworkz.internal.Science;

public class Subject extends Science {

    public Subject(){
        super();
        System.out.println("Running const Subject");
    }

    public void core(){
        System.out.println("Running core in subject");
    }
}
