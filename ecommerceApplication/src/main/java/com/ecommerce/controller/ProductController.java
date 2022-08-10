package com.ecommerce.controller;

import com.ecommerce.model.Products;
import com.ecommerce.repository.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("getall")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }
}
