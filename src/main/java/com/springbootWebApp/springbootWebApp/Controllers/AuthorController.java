package com.springbootWebApp.springbootWebApp.Controllers;

import com.springbootWebApp.springbootWebApp.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(value = "/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors",authorService.findAll());
        return "authors";
    }
}

