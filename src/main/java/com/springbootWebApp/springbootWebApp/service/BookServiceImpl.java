package com.springbootWebApp.springbootWebApp.service;

import com.springbootWebApp.springbootWebApp.domain.Book;
import com.springbootWebApp.springbootWebApp.repositories.BookRepo;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepo.findAll();
    }
}
