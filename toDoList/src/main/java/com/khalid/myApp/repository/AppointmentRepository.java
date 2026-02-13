package com.khalid.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khalid.myApp.models.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}