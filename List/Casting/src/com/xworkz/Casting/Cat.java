package com.xworkz.Casting;

import com.xworkz.external.Dog;
import com.xworkz.internal.Pet;

public class Cat {

    public void purr(Pet pet){
        pet.sleep();
        pet.help();
        pet.guard();
        pet.entertain();
        pet.brighten();

        if(pet instanceof Dog){
            Dog dog=(Dog)pet;
            dog.brighten();
        }
    }
}
