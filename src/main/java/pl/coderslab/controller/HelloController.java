package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.entity.Book;
import pl.coderslab.repository.BookService;

import java.util.List;

@Controller
public class HelloController {

    @GetMapping("")
    public String showPage(){
        return "books/hello";
    }

}

