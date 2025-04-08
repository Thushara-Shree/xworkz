package com.xworkz.Casting;

import com.xworkz.external.TextBook;
import com.xworkz.internal.Books;

public class NoteBook {

    public void page(Books books){
        books.buy();
        books.price();
        books.writer();
        books.learn();
        books.read();


        if(books instanceof TextBook){
            TextBook textBook=(TextBook) books;
            textBook.buy();
        }
    }
}
