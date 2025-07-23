package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Teacher;

public class TeacherUser {
    private Teacher teacher;

    public TeacherUser(Teacher teacher) {
        this.teacher = teacher;
    }

    public void useTeacher() {
        if (teacher != null) {
            teacher.teach();
        } else {
            System.out.println("Teacher is not initialized.");
        }
    }
}
