package com.xworkz.external;

import com.xworkz.internal.School;

public class Education extends School {

    public Education(){
        super();
        System.out.println("Running const education");
    }

    public void syllabus(){
        System.out.println("Running syllabus in Education");
    }
}

