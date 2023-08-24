package com.scb.customer.service;

import com.scb.customer.model.Card;
import com.scb.customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    RestTemplate restTemplate;
    public Customer getCustomerByName(String customer ){
        Customer cust=restTemplate.getForObject("http://localhost:8083/customer/"+customer,Customer.class);
        return cust;
    }
    public List<Customer> getAllCustomer() {
        List<Customer> customerList=restTemplate.getForObject("http://localhost:8083/customer",List.class);
        return customerList;
    }
}
