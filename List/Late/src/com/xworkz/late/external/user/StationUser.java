package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Station;

public class StationUser {
    private Station station;

    public StationUser(Station station) {
        this.station = station;
    }

    public void useStation() {
        if (station != null) {
            station.operate();
        } else {
            System.out.println("Station is not initialized.");
        }
    }
}
