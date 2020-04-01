package com.cenfotec.examen.web;

import com.cenfotec.examen.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataTableController {

    @Autowired
    WarehouseService warehouseService;

    @GetMapping("/dataTable")
    public String dataTable(Model model) {
        model.addAttribute("warehouses", warehouseService.getAllWarehouses());

        return "dataTable";
    }

}
