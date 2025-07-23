package com.xworkz.Casting;

import com.xworkz.external.Seat;
import com.xworkz.internal.Chair;

public class Sofa {

    public void cushion(Chair chair){
        chair.breakChair();
        chair.price();
        chair.buyChair();
        chair.color();
        chair.manufacture();

        if(chair instanceof Seat){
            Seat seat=(Seat)chair;
            seat.breakChair();
        }
    }
}
