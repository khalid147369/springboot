package com.khalid.myApp.controlers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.khalid.myApp.DTO.DoctorDTO;
import com.khalid.myApp.models.Doctor;
import com.khalid.myApp.repository.DoctorRepository;
import com.khalid.myApp.service.CloudinaryImageService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DoctorsController {

    private final DoctorRepository doctorRepository;
    private final CloudinaryImageService cloudinaryImageService;

    DoctorsController(DoctorRepository doctorRepository, CloudinaryImageService cloudinaryImageService) {
        this.doctorRepository = doctorRepository;
        this.cloudinaryImageService = cloudinaryImageService;
    }
    

    @GetMapping("/api/doctors")
    public List<Doctor>  getEmployee() {
       
        return doctorRepository.findAll().reversed() ;  
    }

    @PostMapping("/api/doctors")
    public ResponseEntity<?> createDoctor(
            @RequestParam("nombre") String nombre,
            @RequestParam("contacto") String contacto,
            @RequestParam("especialidad") String especialidad,
            @RequestParam("file") MultipartFile file) {
        try {
            String avatarUrl = cloudinaryImageService.uploadImage(file, "doctors/avatars");
            Doctor doctor = new Doctor(nombre, contacto, especialidad, avatarUrl);
            Doctor savedDoctor = doctorRepository.save(doctor);
            return ResponseEntity.ok(savedDoctor);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error creating doctor: " + e.getMessage());
        }
    }

    @GetMapping("/api/doctors/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id) {
        Doctor doctor = doctorRepository.findById(id).orElse(null);
        if (doctor == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(doctor);
    }

    @PostMapping("/api/doctors/upload-avatar")
    public ResponseEntity<?> uploadDoctorAvatar(@RequestParam("file") MultipartFile file) {
        try {
            String avatarUrl = cloudinaryImageService.uploadImage(file, "doctors/avatars");
            return ResponseEntity.ok(new ImageUploadResponse(avatarUrl));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error uploading image: " + e.getMessage());
        }
    }

    @DeleteMapping("/api/doctors/{id}")
    public ResponseEntity<Doctor> deleteDoctorById(@PathVariable Long id) {
        Doctor doctor = doctorRepository.findById(id).orElse(null);
        if (doctor == null) {
            return ResponseEntity.notFound().build();
        }
        if (doctor.getAvatarPath() != null) {
            cloudinaryImageService.deleteImage(doctor.getAvatarPath());
        }
        doctorRepository.delete(doctor);
        return ResponseEntity.ok().build();
    }

    static class ImageUploadResponse {
        public String url;
        ImageUploadResponse(String url) { this.url = url; }
    }
}
