package com.example.applicationun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BonjourControleur {
    @GetMapping("/Bienvenue")
    public String Bienvenue(){

        return "Bienvenue au monde des containers ";
    }
}
