package com.xworkz.late.internal.imple;

public class EducationImpl implements Education {

    public EducationImpl() {
        System.out.println("EducationImpl object created.");
    }

    @Override
    public void teach() {
        System.out.println("Teaching students...");
    }
}