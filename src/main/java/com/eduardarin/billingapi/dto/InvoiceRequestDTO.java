package com.eduardarin.billingapi.dto;

import com.eduardarin.billingapi.domain.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceRequestDTO {

    private Long idClient;
    private Date expiredDate;
    private String observations;

    private List<ProductDTO> listProducts;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ProductDTO{

        private Long idProduct;
        private int amount;
        private float discount;

    }

}
