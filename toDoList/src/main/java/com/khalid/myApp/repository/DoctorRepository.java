
package com.khalid.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khalid.myApp.models.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}

