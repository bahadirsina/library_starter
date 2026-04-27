package com.turkcell.library_starter.controller;

import com.turkcell.library_starter.service.BorrowServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/borrows")
public class BorrowController {

    private final BorrowServiceImpl borrowService;

    public BorrowController(BorrowServiceImpl borrowService) {
        this.borrowService = borrowService;
    }

}