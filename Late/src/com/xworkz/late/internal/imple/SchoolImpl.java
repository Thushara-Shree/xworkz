package com.xworkz.late.internal.imple;

public class SchoolImpl implements School {

    public SchoolImpl() {
        System.out.println("SchoolImpl object created.");
    }

    @Override
    public void startClass() {
        System.out.println("Starting a new class at the school...");
    }
}
