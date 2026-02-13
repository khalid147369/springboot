package com.khalid.myApp.controlers;

import org.springframework.web.bind.annotation.RestController;

import com.khalid.myApp.DTO.SubscriptionDTO;
import com.khalid.myApp.models.Subscription;
import com.khalid.myApp.models.Family;
import com.khalid.myApp.models.Offer;

import com.khalid.myApp.repository.SubscriptionRepository;
import com.khalid.myApp.repository.FamilyRepository;
import com.khalid.myApp.repository.OfferRepository;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class SubscriptionsController {

    private final SubscriptionRepository subscriptionRepository;
    private final FamilyRepository familyRepository;
    private final OfferRepository offerRepository;

    SubscriptionsController(SubscriptionRepository subscriptionRepository, FamilyRepository familyRepository, OfferRepository offerRepository) {
        this.subscriptionRepository = subscriptionRepository;
        this.familyRepository = familyRepository;
        this.offerRepository = offerRepository;
    }

    @GetMapping("/api/subscriptions")
    public List<Subscription> getSubscriptions() {
        return subscriptionRepository.findAll().reversed();
    }

    @PostMapping("/api/subscriptions")
    public Subscription createSubscription(@RequestBody SubscriptionDTO subscriptionDTO) {
        Family family = familyRepository.findById(subscriptionDTO.getFamilyId()).orElse(null);
        Offer offer = offerRepository.findById(subscriptionDTO.getOfferId()).orElse(null);
        if (family == null || offer == null) {
            throw new RuntimeException("Family or Offer not found");
        }
        Subscription subscription = new Subscription(family, offer, subscriptionDTO.getStartDate(), subscriptionDTO.getEndDate());
        return subscriptionRepository.save(subscription);
    }

    @GetMapping("/api/subscriptions/{id}")
    public ResponseEntity<Subscription> getSubscriptionById(@PathVariable Long id) {
        Subscription subscription = subscriptionRepository.findById(id).orElse(null);
        if (subscription == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(subscription);
    }

    @DeleteMapping("/api/subscriptions/{id}")
    public ResponseEntity<Subscription> deleteSubscriptionById(@PathVariable Long id) {
        Subscription subscription = subscriptionRepository.findById(id).orElse(null);
        if (subscription == null) {
            return ResponseEntity.notFound().build();
        }
        subscriptionRepository.delete(subscription);
        return ResponseEntity.ok().build();
    }

}