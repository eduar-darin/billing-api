package com.eduardarin.billingapi.services.clients;

import com.eduardarin.billingapi.domain.entities.Client;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    Optional<Client> createClient(Client client);
    Optional<Client> updateClient(Client client);
    boolean updateStatusClient(Long idClient, boolean status);
    Optional<Client> findClientById(Long idClient);
    List<Client> findAllClients();

}
