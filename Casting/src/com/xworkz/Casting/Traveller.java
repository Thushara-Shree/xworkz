package com.xworkz.Casting;

import com.xworkz.external.Human;
import com.xworkz.internal.Scientist;

public class Traveller {

    public void passion(Scientist scientist){
        scientist.lab();
        scientist.research();
        scientist.find();
        scientist.experiment();
        scientist.discover();

        if(scientist instanceof Human){
            Human human=(Human)scientist;
            human.discover();
        }

    }
}
