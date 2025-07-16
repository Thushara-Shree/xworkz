package com.xworkz.internal;

import com.xworkz.external.Teacher;

public class MathTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("Teaching math.");
    }

    @Override
    public void grade() {
        System.out.println("Grading math assignments.");
    }

    @Override
    public void giveHomework() {
        System.out.println("Giving math homework.");
    }
}

