package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Boat;

public class BoatUser {
    private Boat boat;

    public BoatUser(Boat boat) {
        this.boat = boat;
    }

    public void useBoat() {
        if (boat != null) {
            boat.sail();
        } else {
            System.out.println("Boat is not initialized.");
        }
    }
}
