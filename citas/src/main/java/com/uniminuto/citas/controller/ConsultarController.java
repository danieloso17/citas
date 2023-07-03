package com.uniminuto.citas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultarController {

    @GetMapping("/consultar.html")
    public String consultar() {
        return "consultar"; // El nombre de la vista HTML sin la extensión ".html"
    }
}

