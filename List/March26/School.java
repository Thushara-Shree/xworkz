package com.xworkz.internal;

public class School {


    private static String studentName;
    private static final String  rule = "discipline";


    static {
        System.out.println("Running static block in School");
        studentName="Harry Potter";
    }

    static void displayDetail(){
        System.out.println("Running display detail in School");
        System.out.println("The student name is: " +School.studentName);
        System.out.println("The rule to be followed is: "+School.rule);
    }
}
