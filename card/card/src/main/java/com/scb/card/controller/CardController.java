package com.scb.card.controller;

import com.scb.card.model.Customer;
import com.scb.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {
    @Autowired
    CardService cardService;

    @GetMapping("/{fName}")
    public Customer getByCustName(@PathVariable("fName") String fName) {

        return cardService.getByCardNumber(fName);
        }
    @GetMapping("/customer")
    public List<Customer> getAllCustomer() {

        return cardService.getAllCustomer();
    }


}
