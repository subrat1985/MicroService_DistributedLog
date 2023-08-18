package com.scb.customer.controller;

import brave.Span;
import brave.Tracer;
import com.scb.customer.model.Card;
import com.scb.customer.model.Customer;
import com.scb.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/customer/{fName}")
    public Customer getCustomerById(@PathVariable("fName") String fName){
        Customer customerById = customerService.getCustomerById(fName);
        return customerById;

    }
    @GetMapping("/customer")
    public List<Customer> getAllCustomer(){
        List<Customer> customerList  = customerService.getAllCustomer();
        return customerList;

    }
    @GetMapping("/card")
    public List<Card> getAllCards(){
        List<Card> cardList  = customerService.getAllCard();
        return cardList;

    }
    @GetMapping("/card/{cNumber}")
    public Card getCardById(@PathVariable("cNumber") String cNumber){
        Card cardById = customerService.getCardById(cNumber);
        return cardById;

    }
}
