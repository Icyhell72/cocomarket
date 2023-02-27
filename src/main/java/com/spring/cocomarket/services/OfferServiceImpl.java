package com.spring.cocomarket.services;

import com.spring.cocomarket.Iservices.IOfferService;
import com.spring.cocomarket.entities.Offer;
import com.spring.cocomarket.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferServiceImpl implements IOfferService {

    @Autowired
    private OfferRepository offerRepository;

    @Override
    public Optional<Offer> getOfferById(int id) {
        return offerRepository.findById(id);
    }

    @Override
    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    @Override
    public Offer addOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public Offer updateOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public void deleteOffer(int id) {
        offerRepository.deleteById(id);
    }
}

