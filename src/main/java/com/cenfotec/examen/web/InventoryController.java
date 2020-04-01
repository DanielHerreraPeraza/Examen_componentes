package com.cenfotec.examen.web;

import com.cenfotec.examen.service.ProductService;
import com.cenfotec.examen.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InventoryController {

    @Autowired
    ProductService productService;
    @Autowired
    WarehouseService warehouseService;

    @RequestMapping("/inventory")
    public String inventory(Model model) {
        model.addAttribute("product", productService.getAllProducts());
        model.addAttribute("warehouses", warehouseService.getAllWarehouses());

        return "inventory";
    }

}
