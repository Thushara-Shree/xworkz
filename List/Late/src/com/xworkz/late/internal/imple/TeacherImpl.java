package com.xworkz.late.internal.imple;


public class TeacherImpl implements Teacher {

    public TeacherImpl() {
        System.out.println("TeacherImpl object created.");
    }

    @Override
    public void teach() {
        System.out.println("Teaching students...");
    }
}
