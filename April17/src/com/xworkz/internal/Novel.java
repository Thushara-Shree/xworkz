package com.xworkz.internal;

import com.xworkz.external.Book;

public class Novel implements Book {

    @Override
    public void open() {
        System.out.println("Opening the novel.");
    }

    @Override
    public void read() {
        System.out.println("Reading the novel.");
    }

    @Override
    public void close() {
        System.out.println("Closing the novel.");
    }

    @Override
    public void library() {
        Book.super.library();
    }
}
