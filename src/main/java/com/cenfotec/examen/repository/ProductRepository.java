package com.cenfotec.examen.repository;

import com.cenfotec.examen.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
