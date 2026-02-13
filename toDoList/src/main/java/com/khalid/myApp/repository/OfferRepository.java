package com.khalid.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khalid.myApp.models.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}