package com.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "products")
@Getter
@Setter
public class Products {

    @Id
    long id;
    String name, price, addedOn, category_id;
}
