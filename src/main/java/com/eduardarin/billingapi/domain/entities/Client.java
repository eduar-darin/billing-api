package com.eduardarin.billingapi.domain.entities;

import com.eduardarin.billingapi.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client{

    private Long id;
    private String typeDocument;
    private String documentNumber;
    private String name;
    private ContactInformation contactInformation;
    private Status status;
    private Date createdDate;

    public Client updateClientInformation(Client client){
        return client;
    }

    public void updateStatusClient(Status status){
        this.status = status;
    }

}
