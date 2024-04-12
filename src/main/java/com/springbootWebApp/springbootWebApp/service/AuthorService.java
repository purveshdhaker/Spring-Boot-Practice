package com.springbootWebApp.springbootWebApp.service;

import com.springbootWebApp.springbootWebApp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
