package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Map;

public class MapUser {
    private Map map;

    public MapUser(Map map) {
        this.map = map;
    }

    public void useMap() {
        if (map != null) {
            map.display();
        } else {
            System.out.println("Map is not initialized.");
        }
    }
}
