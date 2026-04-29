package com.turkcell.library_starter.controller;

import com.turkcell.library_starter.entity.Book;
import com.turkcell.library_starter.service.BookServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable UUID id) {
        return bookService.getBookById(id);
    }
}
