package com.spring.cocomarket.Iservices;

import com.spring.cocomarket.entities.Tender;

import java.util.List;
import java.util.Optional;

public interface ITenderService {
    Optional<Tender> getTenderById(int id);

    List<Tender> getAllTenders();

    Tender addTender(Tender tender);

    Tender updateTender(Tender tender);

    void deleteTender(int id);
}

