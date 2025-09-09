package br.com.spring_boot_rocketseat.main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring_boot_rocketseat.main.ioc_di.MyComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/component")
public class IoCController {
    @Autowired
    private MyComponent myComponent;

    @GetMapping("/call")
    public String callComponent() {
        return myComponent.callMyComponent();
    }
    
}