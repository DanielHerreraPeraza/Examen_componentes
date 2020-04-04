package com.cenfotec.examen.web;

import com.cenfotec.examen.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContentController {

    @Autowired
    ProductService productService;

    @RequestMapping("content")
    public String getContent(Model model, @RequestParam Long id) {
        model.addAttribute("product", productService.findAllByWarehouse(id));

        return "content";
    }

}
