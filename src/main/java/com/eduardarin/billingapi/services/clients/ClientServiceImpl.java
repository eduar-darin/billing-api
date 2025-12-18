package com.eduardarin.billingapi.services.clients;

import com.eduardarin.billingapi.domain.entities.Client;
import com.eduardarin.billingapi.respositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Optional<Client> createClient(Client client) {

        if(clientRepository.existsById(client.getId())){
           throw new IllegalArgumentException("Client Already exist");
        }
        return Optional.of(clientRepository.save(client));
    }

    @Override
    public Optional<Client> updateClient(Client client) {
        if(!clientRepository.existsById(client.getId())){
            throw new IllegalArgumentException("Client not exists");
        }
        return Optional.of(clientRepository.save(client));
    }

    @Override
    public boolean updateStatusClient(Long idClient, boolean status) {
        if(clientRepository.existsById(idClient)){
            throw new NoSuchElementException("Client not exists");
        }
        return false;
    }

    @Override
    public Optional<Client> findClientById(Long idClient) {
        if(!clientRepository.existsById(idClient)){
            throw new NoSuchElementException("Client not exists");
        }
        return clientRepository.findById(idClient);
    }

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }
}
