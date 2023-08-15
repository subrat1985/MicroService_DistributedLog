package com.scb.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CardController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/customer")
    public String getCustomer(String cardNumber) {
        String customer = restTemplate.exchange("http://localhost:8082/customer", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
        }).getBody();
        return customer;

    }
}
