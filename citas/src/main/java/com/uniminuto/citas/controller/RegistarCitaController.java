package com.uniminuto.citas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistarCitaController {
    @GetMapping("/registrar.html")
    public String consultar() {
        return "registrar"; // El nombre de la vista HTML sin la extensión ".html"
    }
}
