package com.turkcell.library_starter.controller;

import com.turkcell.library_starter.service.RestituteServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restitutes")
public class RestituteController {

    private final RestituteServiceImpl restituteService;

    public RestituteController(RestituteServiceImpl restituteService) {
        this.restituteService = restituteService;
    }

}