package com.cenfotec.examen.repository;

import com.cenfotec.examen.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByWarehouse(Long warehouse);
}
