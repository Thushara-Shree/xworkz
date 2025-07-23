package com.xworkz.late.external.user;

import com.xworkz.late.internal.imple.Company;

public class CompanyUser {
    private Company company;

    public CompanyUser(Company company) {
        this.company = company;
    }

    public void useCompany() {
        if (company != null) {
            company.work();
        } else {
            System.out.println("Company is not initialized.");
        }
    }
}