package com.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "category")
@Getter
@Setter
public class Category {

    @Id
    long id;
    String name;
}
