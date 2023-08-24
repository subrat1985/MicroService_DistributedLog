package com.scb.card.controller;

import com.scb.card.model.Card;
import com.scb.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/")
public class CardController {
    @Autowired
    CardService cardService;
    @GetMapping("card/{cNumber}")
    public Card getCardByNo(@PathVariable("cNumber") String cNumber) {
        return cardService.getCardByNo(cNumber);
    }
    @GetMapping("/cards")
    public List<Card> getAllCard() {

        return cardService.getAllCard();
    }



}
