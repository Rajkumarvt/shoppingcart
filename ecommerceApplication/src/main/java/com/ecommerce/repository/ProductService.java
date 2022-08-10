package com.ecommerce.repository;


import com.ecommerce.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Products> getAllProducts(){
        System.out.println("productRepository.findAll()"+productRepository.findAll());
        return productRepository.findAll();
    }

}
