package com.khalid.myApp.controlers;

import org.springframework.web.bind.annotation.RestController;

import com.khalid.myApp.DTO.FamilyDTO;
import com.khalid.myApp.models.Family;

import com.khalid.myApp.repository.FamilyRepository;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class FamiliesController {

    private final FamilyRepository familyRepository;

    FamiliesController(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    @GetMapping("/api/families")
    public List<Family> getFamilies() {
        return familyRepository.findAll().reversed();
    }

    @PostMapping("/api/families")
    public Family createFamily(@RequestBody FamilyDTO familyDTO) {
        Family family = new Family(familyDTO.getName());
        return familyRepository.save(family);
    }

    @GetMapping("/api/families/{id}")
    public ResponseEntity<Family> getFamilyById(@PathVariable Long id) {
        Family family = familyRepository.findById(id).orElse(null);
        if (family == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(family);
    }

    @DeleteMapping("/api/families/{id}")
    public ResponseEntity<Family> deleteFamilyById(@PathVariable Long id) {
        Family family = familyRepository.findById(id).orElse(null);
        if (family == null) {
            return ResponseEntity.notFound().build();
        }
        familyRepository.delete(family);
        return ResponseEntity.ok().build();
    }

}