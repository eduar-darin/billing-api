package com.eduardarin.billingapi.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long id;
    private String name;
    private String description;
    private Enum typeProduct;
    private double priceUnit;
    private float taxes;
    private Enum status;

    public void updatePriceProduct(double priceUnit){
        this.priceUnit = priceUnit;
    }

    public void updateStatusProduct(Enum status){
        this.status = status;
    }


}
