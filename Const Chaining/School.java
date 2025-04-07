package com.xworkz.external;

public class School extends com.xworkz.internal.Education {

    public School(){
        super();
        System.out.println("Running const School");
    }

    public void syllabus(){
        System.out.println("Running syllabus in School");
    }
}

