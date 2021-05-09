package com.lucaszarzur.dsvendas.repositories;

import com.lucaszarzur.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
