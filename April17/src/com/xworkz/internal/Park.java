package com.xworkz.internal;

import com.xworkz.external.Seat;
import com.xworkz.external.Street;

public class Park implements Street, Seat {

    @Override
    public void open() {
        System.out.println("Runing in Park");
    }

    @Override
    public void close() {
        System.out.println("Runing in Park");
    }

    @Override
    public void adjust() {
        System.out.println("Runing in Park");
    }

    @Override
    public void recline() {
        System.out.println("Runing in Park");
    }

    @Override
    public void sit() {
        System.out.println("Runing in Park");
    }

    @Override
    public void repair() {
        System.out.println("Runing in Park");
    }
}
