package com.springbootWebApp.springbootWebApp.repositories;

import com.springbootWebApp.springbootWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {

}
