package com.xworkz.March24_1;

import com.xworkz.March24.Library;

public class Study {

    Library library;

    public Study(Library library){
        this.library=library;
    }

    public void Seat(){
        System.out.println("Running seat in Study");
        if(this.library!=null) {
            this.library.Shelf();
        }
        System.out.println(this.library.book);

    }
}
