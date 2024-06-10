package com.example.library;

public class CD extends LibraryItem {
    public CD(String title) {
        super(title);
    }

    @Override
    public boolean canBeBorrowed() {
        return true;
    }
}
