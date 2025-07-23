package com.xworkz.March24;

public class Maintenance {

    Library library;

    public Maintenance(Library library){
        this.library=library;
    }

    public void cleanliness(){
        System.out.println("Running cleanliness in Maintenance class");
        if(this.library!=null) {
            this.library.Shelf();
        }
        System.out.println(this.library.book);


    }
    public void silence(){
        System.out.println("Running silence in Maintenence");
        if(this.library!=null) {
            this.library.novels();
        }
        System.out.println(this.library.id);
    }
}
