package com.xworkz.internal;

import com.xworkz.external.Hostel;

public class StudentHostel implements Hostel {

    @Override
    public void checkIn() {
        System.out.println("Checking into the student hostel.");
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out of the student hostel.");
    }

    @Override
    public void cleanRooms() {
        System.out.println("Cleaning the rooms in the student hostel.");
    }

    @Override
    public void stay() {
        Hostel.super.stay();
    }
}

