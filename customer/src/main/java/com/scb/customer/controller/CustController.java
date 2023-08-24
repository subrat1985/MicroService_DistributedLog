package com.scb.customer.controller;

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
        Customer customerById = customerService.getCustomerByName(fName);
        return customerById;

    }
    @GetMapping("/customers")
    public List<Customer> getAllCustomer(){
        List<Customer> customerList  = customerService.getAllCustomer();
        return customerList;

    }

}
