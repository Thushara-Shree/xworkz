package com.xworkz.internal;

import com.xworkz.external.Seat;

public class OfficeChair implements Seat {

    @Override
    public void sit() {
        System.out.println("Sitting on the office chair.");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting the office chair height.");
    }

    @Override
    public void recline() {
        System.out.println("Reclining the office chair.");
    }

    @Override
    public void sleep() {
        Seat.super.sleep();
    }
}

