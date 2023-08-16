package com.scb.customer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@AllArgsConstructor
@Getter
public class Card {
    private String cNumber;
    private int billedAmount;
    private int unBilledAmount;
    private Date expiryDate;
}
