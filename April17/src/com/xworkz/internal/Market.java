package com.xworkz.internal;

import com.xworkz.external.Shop;

public class Market implements Shop {

    @Override
    public void coupen() {
        System.out.println("Running coupen in Market");
    }

    @Override
    public void sell() {
        System.out.println("Running sell in Market");
    }

    @Override
    public void purchase() {
        System.out.println("Running purchase in Market");
    }

    @Override
    public void merchant() {
        Shop.super.merchant();
    }
}
