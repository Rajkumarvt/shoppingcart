package com.ecommerce.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "add_to_cart")
@Getter
@Setter
public class AddToCart {

    @Id
    long id;
    long product_id;
    int qty;
    double price;
    String added_date;

}
