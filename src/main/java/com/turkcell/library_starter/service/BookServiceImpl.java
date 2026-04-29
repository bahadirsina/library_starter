package com.turkcell.library_starter.service;

import com.turkcell.library_starter.entity.Book;
import com.turkcell.library_starter.exception.BusinessException;
import com.turkcell.library_starter.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookServiceImpl {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBookById(UUID id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BusinessException(
                        "Book Not Found",
                        "BookNotFound",
                        "Kitap bulunamadı: " + id
                ));
    }
}

