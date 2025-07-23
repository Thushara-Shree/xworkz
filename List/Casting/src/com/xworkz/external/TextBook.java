package com.xworkz.external;

import com.xworkz.internal.Books;

public class TextBook extends Books {

    public TextBook() {
        super();
        System.out.println("Running TextBook  const");
    }

    public void read(){
        System.out.println("Running plugIn in TextBook");
    }

    public void buy(){
        System.out.println("Running remove in TextBook");
    }

    public void writer(){
        System.out.println("Running color in TextBook");
    }

    public void learn(){
        System.out.println("Running price in TextBook");
    }
    public void price(){
        System.out.println("Running capacity in TextBook");
    }

    public void write(){
        System.out.println("Running write in TextBook");
    }
}
