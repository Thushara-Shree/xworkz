package com.xworkz.late.internal.imple;

public class BookImpl implements Book {

    public BookImpl() {
        System.out.println("BookImpl object created.");
    }

    @Override
    public void read() {
        System.out.println("Reading the book...");
    }
}
