package com.scb.card.service;

import com.scb.card.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CardService {
    @Autowired
    RestTemplate restTemplate;
    public Customer getByCardNumber(String customer ){
        Customer cust=restTemplate.getForObject("http://localhost:8082/customer/"+customer,Customer.class);
        return cust;
    }

    public List<Customer> getAllCustomer() {
        List<Customer> customerList=restTemplate.getForObject("http://localhost:8082/customer",List.class);
        return customerList;
    }
}
