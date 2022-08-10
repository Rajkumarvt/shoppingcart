package com.ecommerce.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "orders")
@Getter
@Setter
public class Order {

    @Id
    long id;
    String order_id;
    long product_id;
    int qty;
    double price;
    String order_on;
    int status;
}
