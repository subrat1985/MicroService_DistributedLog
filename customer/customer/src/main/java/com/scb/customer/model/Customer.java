package com.scb.customer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
public class Customer {
    private String fName;
    private String lName;
    private String address;
    private String email;
    private String phone;
    private Card card;
}
