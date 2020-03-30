package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Product;
import com.cenfotec.examen.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepo;

    @Override
    public void saveProduct(Product newProduct) {
        productRepo.save(newProduct);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

}
