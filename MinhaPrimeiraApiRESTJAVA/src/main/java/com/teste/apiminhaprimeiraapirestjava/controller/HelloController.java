package com.teste.apiminhaprimeiraapirestjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Olá, Bootcamp! API funcionando.";
    }

    @GetMapping("/oi")
    public String oi() {
        return "Oi, tudo bem?";
    }

    @GetMapping("/pamonha")
    public String pamonha() {
        return "Pamonha é feita com milho!";
    }
}
