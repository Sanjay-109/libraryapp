package com.example.library;

public abstract class LibraryItem {
    private String title;
    private boolean borrowed;

    public LibraryItem(String title) {
        this.title = title;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public  void setTitle(String title) {
        this.title = title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrowItem() {
        this.borrowed = true;
    }

    public void returnItem() {
        this.borrowed = false;
    }

    public abstract boolean canBeBorrowed();
}
