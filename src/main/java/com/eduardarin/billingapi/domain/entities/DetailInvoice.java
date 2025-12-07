package com.eduardarin.billingapi.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailInvoice {

    private Long id;
    private String invoiceNumber;
    private Long idProduct;
    private int amount;
    private double priceUnit;
    private float discount;
    private float taxes;
    private double total;


    public void calculateTotal(){

    }

}
