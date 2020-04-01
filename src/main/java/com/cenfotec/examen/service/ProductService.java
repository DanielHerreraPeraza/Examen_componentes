package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Product;

import java.util.List;

public interface ProductService {

    void saveProduct(Product newProduct);
    List<Product> getAllProducts();
    List<Product> findAllByWarehouse(Long warehouse);
    
}
