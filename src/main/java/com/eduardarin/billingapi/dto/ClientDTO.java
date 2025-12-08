package com.eduardarin.billingapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    private Long idClient;
    private String typeDocument;
    private String documentNumber;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;


}
