package com.cenfotec.examen.web;

import com.cenfotec.examen.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataTableController {

    @GetMapping("/dataTable")
    public String dataTable() {
        return "dataTable";
    }

}
