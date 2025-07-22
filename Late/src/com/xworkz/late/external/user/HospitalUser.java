package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Hospital;

public class HospitalUser {
    private Hospital hospital;

    public HospitalUser(Hospital hospital) {
        this.hospital = hospital;
    }

    public void useHospital() {
        if (hospital != null) {
            hospital.admitPatient();
        } else {
            System.out.println("Hospital is not initialized.");
        }
    }
}
