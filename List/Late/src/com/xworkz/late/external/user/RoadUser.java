package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Road;

public class RoadUser {
    private Road road;

    public RoadUser(Road road) {
        this.road = road;
    }

    public void useRoad() {
        if (road != null) {
            road.travel();
        } else {
            System.out.println("Road is not initialized.");
        }
    }
}
