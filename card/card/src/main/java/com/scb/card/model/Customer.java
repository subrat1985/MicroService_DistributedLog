package com.scb.card.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
    private String fName;
    private String lName;
    private String address;
    private String email;
    private String phone;
    private Card card;
}
