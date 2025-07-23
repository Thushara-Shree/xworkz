package com.xworkz.Casting;

import com.xworkz.external.Himalaya;
import com.xworkz.internal.FaceWash;

public class AcneStar {

    public void acne(FaceWash faceWash){
        faceWash.sell();
        faceWash.color();
        faceWash.buy();
        faceWash.apply();
        faceWash.price();

        if(faceWash instanceof Himalaya){
            Himalaya himalaya=(Himalaya) faceWash;
            himalaya.clean();
        }
    }
}
