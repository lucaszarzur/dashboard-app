package com.lucaszarzur.dsvendas.repositories;

import com.lucaszarzur.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
