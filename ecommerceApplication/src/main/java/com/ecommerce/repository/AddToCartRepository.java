package com.ecommerce.repository;

import com.ecommerce.model.AddToCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddToCartRepository extends JpaRepository<AddToCart, Long> {
}
