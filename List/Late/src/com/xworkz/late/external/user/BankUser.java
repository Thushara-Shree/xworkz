package com.xworkz.late.external.user;


import com.xworkz.late.internal.imple.Bank;

public class BankUser {
    private Bank bank;

    public BankUser(Bank bank) {
        this.bank = bank;
    }

    public void useBank() {
        if (bank != null) {
            bank.processTransaction();
        } else {
            System.out.println("Bank is not initialized.");
        }
    }
}