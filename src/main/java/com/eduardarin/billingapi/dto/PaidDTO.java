package com.eduardarin.billingapi.dto;


import com.eduardarin.billingapi.domain.enums.MetodPay;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaidDTO {

    private String invoiceNumber;
    private MetodPay metodPay;
    private double valuePaid;
    private Long idClientReference;

}
