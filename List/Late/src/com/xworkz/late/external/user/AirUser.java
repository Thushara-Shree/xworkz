package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Air;

public class AirUser {
    private Air air;

    public AirUser(Air air) {
        this.air = air;
    }

    public void useAir() {
        if (air != null) {
            air.circulate();
        } else {
            System.out.println("Air is not initialized.");
        }
    }
}
