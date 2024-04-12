package com.springbootWebApp.springbootWebApp.service;

import com.springbootWebApp.springbootWebApp.domain.Book;


public interface BookService {
    Iterable<Book> findAll();
}
