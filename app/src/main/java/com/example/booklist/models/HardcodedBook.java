package com.example.booklist.models;

public class HardcodedBook implements Book{
    private String title;
    private String author;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    public HardcodedBook(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
