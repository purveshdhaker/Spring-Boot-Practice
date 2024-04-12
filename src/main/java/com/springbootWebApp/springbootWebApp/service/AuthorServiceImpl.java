package com.springbootWebApp.springbootWebApp.service;

import org.springframework.stereotype.Service;
import com.springbootWebApp.springbootWebApp.domain.Author;
import com.springbootWebApp.springbootWebApp.repositories.AuthorRepo;

@Service
public class AuthorServiceImpl implements AuthorService{
    private final AuthorRepo authorRepository;

    public AuthorServiceImpl(AuthorRepo authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
