package com.spring.cocomarket.controllers;

import com.spring.cocomarket.Iservices.IOfferService;
import com.spring.cocomarket.entities.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/offer")
public class OfferController {

    @Autowired
    private IOfferService offerService;

    @GetMapping("/{id}")
    public Optional<Offer> getOfferById(@PathVariable int id) {
        return offerService.getOfferById(id);
    }

    @GetMapping("/all")
    public List<Offer> getAllOffers() {
        return offerService.getAllOffers();
    }

    @PostMapping("/add")
    public Offer addOffer(@RequestBody Offer offer) {
        return offerService.addOffer(offer);
    }

    @PutMapping("/update")
    public Offer updateOffer(@RequestBody Offer offer) {
        return offerService.updateOffer(offer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOffer(@PathVariable int id) {
        offerService.deleteOffer(id);
    }
}
