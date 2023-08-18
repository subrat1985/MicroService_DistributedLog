package com.scb.card.controller;

import com.scb.card.model.Card;
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
@RequestMapping("/")
public class CardController {
    @Autowired
    CardService cardService;

    @GetMapping("{fName}")
    public Customer getByCustName(@PathVariable("fName") String fName) {
        return cardService.getCustomerByName(fName);
        }
    @GetMapping("/customers")
    public List<Customer> getAllCustomer() {

        return cardService.getAllCustomer();
    }
    @GetMapping("card/{cNumber}")
    public Card getCardByNo(@PathVariable("cNumber") String cNumber) {
        return cardService.getCardByNo(cNumber);
    }
    @GetMapping("/cards")
    public List<Card> getAllCard() {

        return cardService.getAllCard();
    }



}
