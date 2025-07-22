package com.xworkz.internal;

import com.xworkz.external.Library;

public class PublicLibrary implements Library {

    @Override
    public void open() {
        System.out.println("The library is now open.");
    }

    @Override
    public void close() {
        System.out.println("The library is now closed.");
    }

    @Override
    public void lendBook() {
        System.out.println("Lending a book to a visitor.");
    }
}

