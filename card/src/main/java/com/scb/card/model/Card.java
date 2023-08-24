package com.scb.card.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@ToString
public class Card {
    private String cNumber;
    private int billedAmount;
    private int unBilledAmount;
    private Date expiryDate;
}
