package com.turkcell.library_starter.controller;

import com.turkcell.library_starter.service.FineServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fines")
public class FineController {

    private final FineServiceImpl fineService;

    public FineController(FineServiceImpl fineService) {
        this.fineService = fineService;
    }

}