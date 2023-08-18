package com.scb.card.service;

import brave.Span;
import brave.Tracer;
import com.scb.card.model.Card;
import com.scb.card.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CardService {
    @Autowired
    RestTemplate restTemplate;
    public Customer getCustomerByName(String customer ){
        Customer cust=restTemplate.getForObject("http://localhost:8082/customer/"+customer,Customer.class);
        return cust;
    }
    public Card getCardByNo(String cNumber ){
        Card card=restTemplate.getForObject("http://localhost:8082/card/"+cNumber,Card.class);
        return card;
    }

    public List<Customer> getAllCustomer() {
        List<Customer> customerList=restTemplate.getForObject("http://localhost:8082/customer",List.class);
        return customerList;
    }
    public List<Card> getAllCard() {
        List<Card> cardList=restTemplate.getForObject("http://localhost:8082/card",List.class);
        return cardList;
    }
}
