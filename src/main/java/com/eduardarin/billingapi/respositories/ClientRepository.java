package com.eduardarin.billingapi.respositories;

import com.eduardarin.billingapi.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query()
    Optional<Client> findClientByDocument(String document);

    @Query()
    Optional<Client> updateClientStatus(String document);

}
