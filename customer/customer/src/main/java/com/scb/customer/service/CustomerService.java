package com.scb.customer.service;

import com.scb.customer.model.Card;
import com.scb.customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {
    static List<Customer> customerList=new ArrayList<>();
    static List<Card> cardList=new ArrayList<>();
    public static List<Customer> getAllCustomer(){
        Card card1=new Card("123",1000,2000,new Date(25/12/2024));
        Card card2=new Card("321",2000,3000,new Date(25/11/2024));
        Card card3=new Card("213",3000,4000,new Date(25/10/2024));
        Card card4=new Card("132",4000,5000,new Date(25/9/2024));
        Customer customer1=new Customer("Subrat1","Mishra1","Odisha","s1@gmail.com","9538569561",card1);
        Customer customer2=new Customer("Subrat2","Mishra2","Odisha","s2@gmail.com","9538569562",card2);
        Customer customer3=new Customer("Subrat3","Mishra3","Odisha","s3@gmail.com","9538569563",card3);
        Customer customer4=new Customer("Subrat","Mishra","Odisha","s4@gmail.com","9538569564",card4);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        return customerList;


    }
    public static List<Card> getAllCard(){
        Card card1=new Card("123",1000,2000,new Date(25/12/2024));
        Card card2=new Card("321",2000,3000,new Date(25/11/2024));
        Card card3=new Card("213",3000,4000,new Date(25/10/2024));
        Card card4=new Card("132",4000,5000,new Date(25/9/2024));
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        return cardList;
    }

    public Customer getCustomerById(String id) {
        return getAllCustomer().stream().filter(customer -> customer.getFName().equalsIgnoreCase(id)).findFirst().orElseThrow();
        }
    public Card getCardById(String id) {
        return getAllCard().stream().filter(card -> card.getCNumber().equalsIgnoreCase(id)).findFirst().orElseThrow();
    }

}
