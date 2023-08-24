package com.sc.data.controller;

import com.sc.data.model.Card;
import com.sc.data.model.Customer;
import com.sc.data.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
    @Autowired
    DataService dataService;
    @GetMapping("/customer/{fName}")
    public Customer getCustomerById(@PathVariable("fName") String fName){
        Customer customerById = dataService.getCustomerById(fName);
        return customerById;

    }
    @GetMapping("/customer")
    public List<Customer> getAllCustomer(){
        List<Customer> customerList  = dataService.getAllCustomer();
        return customerList;

    }
    @GetMapping("/card")
    public List<Card> getAllCards(){
        List<Card> cardList  = dataService.getAllCard();
        return cardList;

    }
    @GetMapping("/card/{cNumber}")
    public Card getCardById(@PathVariable("cNumber") String cNumber){
        Card cardById = dataService.getCardById(cNumber);
        return cardById;

    }
}
