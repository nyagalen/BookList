package com.example.booklist.repository;

import android.os.Build;

import com.example.booklist.models.Book;
import com.example.booklist.models.HardcodedBook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HardcodedBooksRepository implements BooksRepository {
private List<Book> list = new ArrayList<>();
    {
        list.add(new HardcodedBook("Linux","Linus Torvalds"));
        list.add(new HardcodedBook("Short History of Nearly Everything", "Bill Bryson"));
        list.add(new HardcodedBook("Going postal", "Terry Pratchett"));
        list.add(new HardcodedBook("postal", "Terry Pratchett"));
        list.add(new HardcodedBook("Going", "Terry Pratchett"));
        list.add(new HardcodedBook("Something", "Terry Pratchett"));
        list.add(new HardcodedBook("Something 2", "Terry Pratchett"));
        list.add(new HardcodedBook("New book", "Terry Pratchett"));
        list.add(new HardcodedBook("Some other book", "Terry Pratchett"));
        list.add(new HardcodedBook("More books", "Terry Pratchett"));
        list.add(new HardcodedBook("Book 1", "Terry Pratchett"));
        list.add(new HardcodedBook("Book 2", "Terry Pratchett"));
        list.add(new HardcodedBook("Good book", "Terry Pratchett"));
        list.add(new HardcodedBook("New book", "Terry Pratchett"));
    }

    @Override
    public List<Book> getBooks() {



        return list;
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return list.stream().filter(b->b.getAuthor().equals(author)).collect(Collectors.toList());
        }
        return null;
    }

    @Override
    public List<Book> getBooksByKeyword(String keyword) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return list.stream().filter(b->b.getTitle().contains(keyword)).collect(Collectors.toList());
        }
        return null;
    }
}
