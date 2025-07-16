package com.xworkz.external;

public interface Hostel {
    void checkIn();
    void checkOut();
    void cleanRooms();

    default void stay(){
        System.out.println("Runing stay in Hostel");
    }
}

