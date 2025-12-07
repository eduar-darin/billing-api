package com.eduardarin.billingapi.domain.entities;

import com.eduardarin.billingapi.domain.enums.MetodPay;
import com.eduardarin.billingapi.domain.enums.TypeBill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pay {

    private Long id;
    private Long idInvoice;
    private Date paidDate;
    private MetodPay metodPay;
    private double valuePaid;
    private Long idClientReference;
    private TypeBill typeBill;

    public void registerPaid(){}

    public void validPaid(){}

}
