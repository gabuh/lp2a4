package com.example.restaurant.controller;

import com.example.restaurant.repository.CostumeRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/costumer")
public class CostumerController {
    private CostumeRepository costumeRepository;



}
