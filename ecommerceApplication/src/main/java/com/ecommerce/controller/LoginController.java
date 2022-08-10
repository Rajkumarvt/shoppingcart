package com.ecommerce.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/user")
    public ResponseEntity<?> checkLogin(){
        System.out.println("Inside the users...it is working...");
        return ResponseEntity.ok("test success");
    }
}
