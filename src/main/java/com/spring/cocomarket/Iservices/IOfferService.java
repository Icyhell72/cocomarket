package com.spring.cocomarket.Iservices;

import com.spring.cocomarket.entities.Offer;

import java.util.List;
import java.util.Optional;

public interface IOfferService {
    Optional<Offer> getOfferById(int id);

    List<Offer> getAllOffers();

    Offer addOffer(Offer offer);

    Offer updateOffer(Offer offer);

    void deleteOffer(int id);

    Offer getBestOffer();

}

