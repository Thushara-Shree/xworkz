package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Education;

public class EducationUser {
    private Education education;

    public EducationUser(Education education) {
        this.education = education;
    }

    public void useEducation() {
        if (education != null) {
            education.teach();
        } else {
            System.out.println("Education system is not initialized.");
        }
    }
}
