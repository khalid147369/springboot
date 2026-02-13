package com.khalid.myApp.controlers;

import org.springframework.web.bind.annotation.RestController;

import com.khalid.myApp.DTO.OfferDTO;
import com.khalid.myApp.models.Offer;

import com.khalid.myApp.repository.OfferRepository;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class OffersController {

    private final OfferRepository offerRepository;

    OffersController(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @GetMapping("/api/offers")
    public List<Offer> getOffers() {
        return offerRepository.findAll().reversed();
    }

    @PostMapping("/api/offers")
    public Offer createOffer(@RequestBody OfferDTO offerDTO) {
        Offer offer = new Offer(offerDTO.getName(), offerDTO.getDescription());
        return offerRepository.save(offer);
    }

    @GetMapping("/api/offers/{id}")
    public ResponseEntity<Offer> getOfferById(@PathVariable Long id) {
        Offer offer = offerRepository.findById(id).orElse(null);
        if (offer == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(offer);
    }

    @DeleteMapping("/api/offers/{id}")
    public ResponseEntity<Offer> deleteOfferById(@PathVariable Long id) {
        Offer offer = offerRepository.findById(id).orElse(null);
        if (offer == null) {
            return ResponseEntity.notFound().build();
        }
        offerRepository.delete(offer);
        return ResponseEntity.ok().build();
    }

}