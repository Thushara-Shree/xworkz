package com.xworkz.external;

import com.xworkz.internal.Book;

public class Chapter extends Book {

    public Chapter(){
        subject();
        System.out.println("Running const cgapter");
    }

    public void title(){
        System.out.println("Running title in chapter");
    }
}
