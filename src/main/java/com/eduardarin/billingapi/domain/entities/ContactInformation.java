package com.eduardarin.billingapi.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactInformation {

    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String country;
}
