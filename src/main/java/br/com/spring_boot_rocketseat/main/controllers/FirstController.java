package br.com.spring_boot_rocketseat.main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/method")
    public String getMethodName() {
        return "Deu certo";
    }
    
}