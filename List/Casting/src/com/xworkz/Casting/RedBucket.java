package com.xworkz.Casting;

import com.xworkz.external.Tray;
import com.xworkz.internal.Bucket;

public class RedBucket {

    public void contain(Bucket bucket){
        bucket.color();
        bucket.wash();
        bucket.sell();
        bucket.buy();
        bucket.price();


        if(bucket instanceof Tray){
            Tray tray=(Tray) bucket;
            tray.buy();

        }
    }
}
