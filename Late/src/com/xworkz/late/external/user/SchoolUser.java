package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.School;

public class SchoolUser {
    private School school;

    public SchoolUser(School school) {
        this.school = school;
    }

    public void useSchool() {
        if (school != null) {
            school.startClass();
        } else {
            System.out.println("School is not initialized.");
        }
    }
}
