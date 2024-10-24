package com.org.example;

public class Book {
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle + "," + bookNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book std) {
            return this.bookNumber == std.bookNumber;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return bookNumber;
    }
}
