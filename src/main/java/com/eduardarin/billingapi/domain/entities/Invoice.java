package com.eduardarin.billingapi.domain.entities;

import com.eduardarin.billingapi.domain.enums.StatusBilling;
import com.eduardarin.billingapi.domain.enums.TypeBill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    private Long id;
    private String invoiceNumber;
    private Long idClient;
    private Date creationDate;
    private Date expirationDate;
    private double subtotal;
    private double totalTaxes;
    private double totalDiscount;
    private double total;
    private StatusBilling statusBilling;
    private TypeBill typeBill;
    private String observation;


    public void calculateTotal(){
    }

    public void issueInvoice(){

    }

    public void cancelInvoice(){

    }

    public void checkPaid(){

    }

}
