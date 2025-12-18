package com.eduardarin.billingapi.services.clients;

import com.eduardarin.billingapi.domain.entities.Client;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ClientService {

    Client createClient(Client client);
    Client updateClient(Client client);
    boolean updateStatusClient(Long idClient, boolean status);
    Client findClientById(Long idClient);
    List findAllClients();

}
