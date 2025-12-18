package com.eduardarin.billingapi.controllers;


import com.eduardarin.billingapi.dto.ClientDTO;
import com.eduardarin.billingapi.services.clients.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping("/findClient/{idClient}")
    public ResponseEntity<ClientDTO> findClientById(@PathVariable Long idClient) {
        return clientService.findClientById(idClient)
                .map(client -> ResponseEntity.ok(mapper.toDTO(client)))
                .orElse(ResponseEntity.notFound().build());
    }
}
