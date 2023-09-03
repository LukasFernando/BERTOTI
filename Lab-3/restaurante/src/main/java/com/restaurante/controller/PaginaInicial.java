package com.restaurante.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PaginaInicial {
    @GetMapping("/inicio")
    String getPaginaInicial2(){
        return "paginaInicial";
    }

    @GetMapping
    String getPaginaInicial(){
        return "teste";
    }
}
