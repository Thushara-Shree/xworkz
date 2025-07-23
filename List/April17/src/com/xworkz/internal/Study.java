package com.xworkz.internal;

import com.xworkz.external.Book;
import com.xworkz.external.Library;

public class Study implements Book, Library {

    @Override
    public void close() {
        System.out.println("Running in study");

    }

    @Override
    public void open() {
        System.out.println("Running in study");

    }

    @Override
    public void read() {
        System.out.println("Running in study");

    }

    @Override
    public void lendBook() {
        System.out.println("Running in study");

    }


}
