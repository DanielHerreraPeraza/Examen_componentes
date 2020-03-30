package com.cenfotec.examen.web;

import com.cenfotec.examen.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InventoryController {

    @Autowired
    ProductRepository repo;

    @RequestMapping("/inventory")
    public String inventory(Model model) {
        model.addAttribute("product", repo.findAll());

        return "inventory";
    }

}
