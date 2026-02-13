package com.khalid.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khalid.myApp.models.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}