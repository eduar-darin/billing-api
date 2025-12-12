package com.eduardarin.billingapi.respositories;


import com.eduardarin.billingapi.domain.entities.Invoice;
import com.eduardarin.billingapi.domain.enums.StatusBilling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

    @Query()
    Optional<Invoice> findNumberOfInvoice(Long idInvoice);
    @Query()
    Optional<Invoice> findInvoiceByClient(Long idClient);
    @Query()
    Optional<Boolean> updateStatusInvoice(StatusBilling statusBilling);

}
