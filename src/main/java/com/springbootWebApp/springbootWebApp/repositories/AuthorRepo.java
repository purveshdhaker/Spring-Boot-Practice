package com.springbootWebApp.springbootWebApp.repositories;

import com.springbootWebApp.springbootWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
