package com.eduardarin.billingapi.respositories;

import com.eduardarin.billingapi.domain.entities.Pay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaidRepository extends JpaRepository<Pay,Long> {

    @Query()
    Optional<Pay> findPayByInvoiceId(Long invoiceId);
    @Query()
    Optional<Double> findTotalValuePaid(Long idPaid);
}
