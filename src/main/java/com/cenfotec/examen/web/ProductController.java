package com.cenfotec.examen.web;

import com.cenfotec.examen.domain.Product;
import com.cenfotec.examen.service.ProductService;
import com.cenfotec.examen.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    WarehouseService warehouseService;

    @GetMapping("/product")
    public String product(Model model) {
        model.addAttribute("product", new Product());

        model.addAttribute("warehouses", warehouseService.getAllWarehouses());
        return "form";
    }

    @PostMapping("/product")
    public String product(@ModelAttribute Product product, Model model) {
        model.addAttribute("product", product);
        productService.saveProduct(product);
        return "result";
    }

}
