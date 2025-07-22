package com.xworkz.late.internal.imple;

public class BankImpl implements Bank {

    public BankImpl() {
        System.out.println("BankImpl object created.");
    }

    @Override
    public void processTransaction() {
        System.out.println("Processing bank transaction...");
    }
}
