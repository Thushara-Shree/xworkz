package com.xworkz.March24;

public class Library {

    public String book="Famous Five";
    int id=1;
    private boolean bookStatus=true;

    public void Shelf(){
        System.out.println("Running shelf in Library");
novels();
    }

    void novels(){
        System.out.println("Running novels in Library");
        System.out.println(bookStatus);
    }

    private void registration(){
        System.out.println("Running registation in Library");

    }

}
