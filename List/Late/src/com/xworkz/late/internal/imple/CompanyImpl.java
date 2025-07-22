package com.xworkz.late.internal.imple;

public class CompanyImpl implements Company {

    public CompanyImpl() {
        System.out.println("CompanyImpl object created.");
    }

    @Override
    public void work() {
        System.out.println("Working in the company...");
    }
}
