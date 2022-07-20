package com.prestes.aulajwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Bem vindo a minha API Spring Boot com Security";
    }
    @GetMapping("/users")
    public String users() {
        return "Autorização de Usuario";
    }
    @GetMapping("/managers")
    public String managers() {
        return "Autorização de Gerenciamento";
    }
}