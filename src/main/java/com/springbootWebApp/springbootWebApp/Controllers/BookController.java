package com.springbootWebApp.springbootWebApp.Controllers;

import com.springbootWebApp.springbootWebApp.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/books")
    public String getBooks(Model model) {
        model.addAttribute("books",bookService.findAll());
        return "books";
    }

}
