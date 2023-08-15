package com.scb.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustController {
    @GetMapping("/customer")
    public String getCustomer(String id){
        return "Hello";

    }
}
