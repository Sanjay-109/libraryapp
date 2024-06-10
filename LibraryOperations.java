package com.example.library;

public interface LibraryOperations {
    void addItem(LibraryItem item);
    void removeItem(LibraryItem item);
    boolean borrowItem(LibraryItem item);
    void returnItem(LibraryItem item);
    void listItems();
}
