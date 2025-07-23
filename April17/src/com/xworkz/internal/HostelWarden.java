package com.xworkz.internal;

import com.xworkz.external.Warden;

public class HostelWarden implements Warden {

    @Override
    public void monitor() {
        System.out.println("Monitoring the hostel activities.");
    }

    @Override
    public void supervise() {
        System.out.println("Supervising the students in the hostel.");
    }

    @Override
    public void discipline() {
        System.out.println("Disciplining the students for any misconduct.");
    }

    @Override
    public void guide() {
        Warden.super.guide();
    }
}

