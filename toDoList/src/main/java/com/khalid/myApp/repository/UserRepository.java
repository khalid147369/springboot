package com.khalid.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khalid.myApp.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}