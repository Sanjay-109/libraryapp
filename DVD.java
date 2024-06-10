package com.example.library;

public class DVD extends LibraryItem {
    public DVD(String title) {
        super(title);
    }

    @Override
    public boolean canBeBorrowed() {
        return true;
    }
}
