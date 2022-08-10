package com.ecommerce.repository;

import com.ecommerce.model.Order;
import com.ecommerce.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
