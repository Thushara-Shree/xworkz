package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Railway;

public class RailwayUser {
    private Railway railway;

    public RailwayUser(Railway railway) {
        this.railway = railway;
    }

    public void useRailway() {
        if (railway != null) {
            railway.runTrain();
        } else {
            System.out.println("Railway is not initialized.");
        }
    }
}

