package com.xworkz.internal;

import com.xworkz.external.School;

public class Student implements School {

    @Override
    public void study() {
        System.out.println("Student is studying in the classroom.");
    }

    @Override
    public void play() {
        System.out.println("Student is playing in the playground.");
    }

    @Override
    public void attendAssembly() {
        System.out.println("Student is attending the morning assembly.");
    }

    @Override
    public void learn() {
        School.super.learn();
    }
}

