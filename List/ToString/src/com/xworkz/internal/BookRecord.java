package com.xworkz.internal;

public class BookRecord {

        private String book;
        private String owner;
        private String shelf;

        public BookRecord(String book, String owner, String shelf) {
            this.book = book;
            this.owner = owner;
            this.shelf = shelf;
        }

        @Override
        public String toString() {
            return "Book Record:\n" +
                    book.toString() + "\n" +
                    "Owner: " + owner + "\n" +
                    "Shelf: " + shelf;
        }
    }


