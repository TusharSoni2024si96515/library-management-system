package com.saco.library.service;

import java.util.ArrayList;
import java.util.List;

import com.saco.library.model.Book;

public class LibraryService {

    private static final List<Book> books = new ArrayList<>();

    static {
        books.add(new Book(1, "Effective Java", "Joshua Bloch"));
        books.add(new Book(2, "Clean Code", "Robert Martin"));
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        }
    }
}
