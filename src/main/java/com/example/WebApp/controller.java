package com.example.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public String Mensaje() {
        System.out.println("Mensaje de Exito");
        return "Hola, Esta es una prueba con Spring Boot en Oracle Cloud";
    }
    
}
