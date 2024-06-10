package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    @Override
    public void removeItem(LibraryItem item) {
        if (items.remove(item)) {
            System.out.println("Removed item: " + item.getTitle());
        } else {
            System.out.println("Item not found: " + item.getTitle());
        }
    }

    @Override
    public boolean borrowItem(LibraryItem item) {
        if (item.canBeBorrowed() && !item.isBorrowed() && items.contains(item)) {
            item.borrowItem();
            System.out.println("Borrowed item: " + item.getTitle());
            return true;
        } else if ( !item.canBeBorrowed()) {
            System.out.println("Cannot borrow periodicals from library.");
            return false;
        }
        System.out.println("Item already borrowed: " + item.getTitle());
        return false;
    }

    @Override
    public void returnItem(LibraryItem item) {
        if (item.isBorrowed()) {
            item.returnItem();
            System.out.println("Returned item: " + item.getTitle());
        } else {
            System.out.println("Item not borrowed: " + item.getTitle());
        }
    }

    @Override
    public void listItems() {
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + " Borrowed: " + item.isBorrowed() );
        }
    }
}
