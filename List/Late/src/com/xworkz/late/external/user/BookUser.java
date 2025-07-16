package com.xworkz.late.external.user;


import com.xworkz.late.internal.imple.Book;

public class BookUser {
    private Book book;

    public BookUser(Book book) {
        this.book = book;
    }

    public void useBook() {
        if (book != null) {
            book.read();
        } else {
            System.out.println("Book is not initialized.");
        }
    }
}
