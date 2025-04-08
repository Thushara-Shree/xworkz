package com.xworkz.external;

import com.xworkz.internal.Education;

public class School extends Education {

    public School(){
        super();
        System.out.println("Running const School");
    }

    public void syllabus(){
        System.out.println("Running syllabus in School");
    }
}

