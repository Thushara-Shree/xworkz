package com.xworkz;

public class Soft {

    public void sleep(Pillow pillow){

        if(pillow!=null){
            pillow.feature();
        }
        else {
            System.out.println("The reference points towards null value");
        }

    }
}
