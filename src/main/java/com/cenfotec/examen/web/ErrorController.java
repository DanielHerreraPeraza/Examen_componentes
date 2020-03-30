package com.cenfotec.examen.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ErrorController {

    @GetMapping("/error")
    public String error(Model model) {
        model.addAttribute("product", "product");
        return "error";
    }

}
