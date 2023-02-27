package com.spring.cocomarket.repositories;

import com.spring.cocomarket.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}

