package com.eduardarin.billingapi.dto;

import com.eduardarin.billingapi.domain.enums.StatusBilling;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceResponseDTO {

    private String invoiceNumber;
    private Long idClient;
    private double total;
    private StatusBilling statusBilling;
    private Date creationDate;
    private List<?> listItems;

}
