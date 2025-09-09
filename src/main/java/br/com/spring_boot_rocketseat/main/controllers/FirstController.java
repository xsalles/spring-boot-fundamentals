package br.com.spring_boot_rocketseat.main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


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

    @GetMapping("/bodyParam")
    public String getBodyParam(@RequestBody String id) {
       return "O parâmetro é: " + id;
    }

    @PostMapping("/headerParam")
    public String getHeaderParam(@RequestHeader("name") String name) {
       return "O parâmetro é: " + name;
    }

    @GetMapping("/responseEntity/{name}")
    public ResponseEntity<String> getResponseEntity(@PathVariable String name) {
        if (name == null || name.isEmpty() || !name.toLowerCase().equals("pedro")) {
            return ResponseEntity.status(400).body("Acesso Negado");
        }

        return ResponseEntity.ok().body("Acesso permitido");
    }
}