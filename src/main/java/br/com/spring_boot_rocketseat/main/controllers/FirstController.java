package br.com.spring_boot_rocketseat.main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/method")
    public String getMethodName() {
        return "Deu certo";
    }

    @GetMapping("/pathParam/{id}")
    public String getPathParam(@PathVariable Integer id) {
        return "O parâmetro é: " + id;
    }

    @GetMapping("/queryParam")
    public String getQueryParam(@RequestParam Integer id) {
       return "O parâmetro é: " + id;
    }
}