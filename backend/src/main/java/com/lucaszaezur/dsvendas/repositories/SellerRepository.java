package com.lucaszaezur.dsvendas.repositories;

import com.lucaszaezur.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
