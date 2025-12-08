package com.eduardarin.billingapi.domain.entities;

import com.eduardarin.billingapi.domain.enums.Status;
import com.eduardarin.billingapi.domain.enums.TypeProduct;
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
    private TypeProduct typeProduct;
    private double priceUnit;
    private float taxes;
    private Status status;

    public void updatePriceProduct(double priceUnit){
        this.priceUnit = priceUnit;
    }

    public void updateStatusProduct(Status status){
        this.status = status;
    }


}
