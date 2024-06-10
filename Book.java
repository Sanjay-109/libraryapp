package com.example.library;

public class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }

    @Override
    public boolean canBeBorrowed() {
        return true;
    }
}
