package com.xworkz.external;

public interface Church {
    void openDoors();
    void holdService();
    void closeDoors();

    default void pray(){
        System.out.println("Running pray in church");
    }
}
