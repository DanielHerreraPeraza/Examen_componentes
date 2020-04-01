package com.cenfotec.examen.web;

import com.cenfotec.examen.domain.Product;
import com.cenfotec.examen.service.ProductService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private ProductService  productService;

    @GetMapping("/api")
    public ResponseEntity<String> products() {
        List<Product> products = productService.getAllProducts();
        String json = new Gson().toJson(products);

        return new ResponseEntity<>(json, HttpStatus.OK);
    }

    @GetMapping("/prodByWarehouse")
    public ResponseEntity<String> productByWarehouse(@RequestParam Long id) {
        List<Product> products = productService.findAllByWarehouse(id);

        String json = new Gson().toJson(products);

        return new ResponseEntity<>(json, HttpStatus.OK);
    }

}
