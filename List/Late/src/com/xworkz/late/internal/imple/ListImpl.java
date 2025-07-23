package com.xworkz.late.internal.imple;


public class ListImpl implements List {

    public ListImpl() {
        System.out.println("ListImpl object created.");
    }

    @Override
    public void showItems() {
        System.out.println("Showing items in the list...");
    }
}
