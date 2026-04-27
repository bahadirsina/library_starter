package com.turkcell.library_starter.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.turkcell.library_starter.entity.Book;

public interface BookRepository extends JpaRepository<Book, UUID> {

}