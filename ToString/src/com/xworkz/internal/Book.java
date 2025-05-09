package com.xworkz.internal;

public class Book {

        private String title;
        private String author;
        private int pages;

        public Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
        }
    }

