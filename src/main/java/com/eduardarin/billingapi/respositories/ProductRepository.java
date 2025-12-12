package com.eduardarin.billingapi.respositories;

import com.eduardarin.billingapi.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query()
    Optional<Product> updatePriceOfUnitProduct(double priceUnitProduct);

}
