package com.spring.cocomarket.repositories;

import com.spring.cocomarket.entities.Tender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenderRepository extends JpaRepository<Tender, Integer> {
}

