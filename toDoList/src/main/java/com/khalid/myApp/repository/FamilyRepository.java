package com.khalid.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khalid.myApp.models.Family;

public interface FamilyRepository extends JpaRepository<Family, Long> {
}