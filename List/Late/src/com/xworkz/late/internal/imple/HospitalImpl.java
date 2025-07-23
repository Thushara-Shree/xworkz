package com.xworkz.late.internal.imple;

public class HospitalImpl implements Hospital {

    public HospitalImpl() {
        System.out.println("HospitalImpl object created.");
    }

    @Override
    public void admitPatient() {
        System.out.println("Admitting patient to the hospital...");
    }
}
