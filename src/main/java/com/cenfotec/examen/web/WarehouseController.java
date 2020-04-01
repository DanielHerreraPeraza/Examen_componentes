package com.cenfotec.examen.web;

import com.cenfotec.examen.domain.Product;
import com.cenfotec.examen.domain.Warehouse;
import com.cenfotec.examen.service.ProductService;
import com.cenfotec.examen.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @GetMapping("/warehouse")
    public String warehouse(Model model) {
        model.addAttribute("warehouse", new Warehouse());
        return "formWarehouse";
    }

    @PostMapping("/warehouse")
    public String product(@ModelAttribute Warehouse warehouse, Model model) {
        model.addAttribute("warehouse", warehouse);
        warehouseService.saveWarehouse(warehouse);
        return "index";
    }

}
