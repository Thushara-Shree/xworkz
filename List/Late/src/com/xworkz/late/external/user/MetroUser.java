package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Metro;

public class MetroUser {
    private Metro metro;

    public MetroUser(Metro metro) {
        this.metro = metro;
    }

    public void useMetro() {
        if (metro != null) {
            metro.travel();
        } else {
            System.out.println("Metro is not initialized.");
        }
    }
}
