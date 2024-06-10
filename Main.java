package com.example.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Book1");
        Book book2 = new Book("Book 2");
        CD cd1 = new CD("CD 1");
        CD cd2 = new CD("CD 2");
        DVD dvd1 = new DVD("DVD 1");
        DVD dvd2 = new DVD("DVD 2");
        Periodical periodical1 = new Periodical("Periodical 1");
        Periodical periodical2 = new Periodical("Periodical 2");

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(cd1);
        library.addItem(cd2);
        library.addItem(dvd1);
        library.addItem(dvd2);
        library.addItem(periodical1);
        library.addItem(periodical2);

        System.out.println("Library Inventory:");
        library.listItems();

        System.out.println("\nBorrowing 'Book 2': " + library.borrowItem(book2));
        System.out.println("Borrowing 'Periodical 1': " + library.borrowItem(periodical1));

        System.out.println("\nLibrary Inventory after borrowing:");
        library.listItems();

        library.returnItem(book2);

        System.out.println("\nLibrary Inventory after returning 'Book 1':");
        library.listItems();

        library.removeItem(cd1);

        System.out.println("\nLibrary Inventory after removing 'CD 1':");
        library.listItems();
    }
}
