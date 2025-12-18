package com.eduardarin.billingapi.services.clients;

import com.eduardarin.billingapi.domain.entities.Client;
import com.eduardarin.billingapi.respositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Client createClient(Client client) {

        if(clientRepository.existsById(client.getId())){
           throw new IllegalArgumentException("Client Already exist");
        }
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        if(!clientRepository.existsById(client.getId())){
            throw new IllegalArgumentException("Client not exists");
        }
        return clientRepository.save(client);
    }

    @Override
    public boolean updateStatusClient(Long idClient, boolean status) {
        if(clientRepository.existsById(idClient)){
            throw new NoSuchElementException("Client not exists");
        }
        return false;
    }

    @Override
    public Client findClientById(Long idClient) {
        if(!clientRepository.existsById(idClient)){
            throw new NoSuchElementException("Client not exists");
        }
        return clientRepository.findById(idClient).get();
    }

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }
}
