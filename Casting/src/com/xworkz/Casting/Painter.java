package com.xworkz.Casting;

import com.xworkz.external.Plastic;
import com.xworkz.external.Player;
import com.xworkz.internal.Student;

public class Painter {

    public void brush(Student student){
        student.study();
        student.project();
        student.participate();
        student.learn();
        student.assignment();


        if(student instanceof Player){
            Player player=(Player) student;
            player.assignment();
        }
    }
}
