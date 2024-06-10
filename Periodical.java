package com.example.library;

public class Periodical extends LibraryItem {
    public Periodical(String title) {
        super(title);
    }

    @Override
    public boolean canBeBorrowed() {
        return false;
    }
}
