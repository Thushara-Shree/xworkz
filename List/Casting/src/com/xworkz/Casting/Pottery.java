package com.xworkz.Casting;

import com.xworkz.external.Painting;
import com.xworkz.internal.Art;

public class Pottery {

    public void mud(Art art){
        art.sell();
        art.frame();
        art.create();
        art.fix();
        art.sell();

        if(art instanceof Painting){
            Painting painting=(Painting)art;
            painting.frame();
        }

    }
}
