package com.ecommerce.repository;

import com.ecommerce.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
