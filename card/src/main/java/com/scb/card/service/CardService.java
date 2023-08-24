package com.scb.card.service;

import com.scb.card.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CardService {
    @Autowired
    RestTemplate restTemplate;
    public Card getCardByNo(String cNumber ){
        Card card=restTemplate.getForObject("http://localhost:8083/card/"+cNumber,Card.class);
        return card;
    }
    public List<Card> getAllCard() {
        List<Card> cardList=restTemplate.getForObject("http://localhost:8083/card",List.class);
        return cardList;
    }
}
