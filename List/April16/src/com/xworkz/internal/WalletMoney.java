package com.xworkz.internal;

import com.xworkz.external.Money;

public class WalletMoney implements Money {

    @Override
    public void earn() {
        System.out.println("Earning money through work.");
    }

    @Override
    public void spend() {
        System.out.println("Spending money on goods and services.");
    }

    @Override
    public void save() {
        System.out.println("Saving money for future needs.");
    }
}
