package com.soulcode.soulib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Configura nossa classe como um controlador web
@Controller
public class HomeController {
    // Configura o método para responder a uma requisição
    // para /home
    @GetMapping("/home")
    public String paginaHome() {
        return "index"; // Indica qual view será exibida
    }

    @GetMapping("/contato")
    public String paginaContato() {
        return "contato"; // Indica qual view será exibida
    }
}