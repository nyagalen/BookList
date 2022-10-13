package com.example.booklist.repository;

public class BooksRepositoryFactory {
    public static BooksRepository getBooksRepository(){
        return new HardcodedBooksRepository();
    }
}
