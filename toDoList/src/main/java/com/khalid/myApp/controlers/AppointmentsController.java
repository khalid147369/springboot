package com.khalid.myApp.controlers;

import org.springframework.web.bind.annotation.RestController;

import com.khalid.myApp.DTO.AppointmentDTO;
import com.khalid.myApp.models.Appointment;
import com.khalid.myApp.models.User;
import com.khalid.myApp.models.Doctor;

import com.khalid.myApp.repository.AppointmentRepository;
import com.khalid.myApp.repository.UserRepository;
import com.khalid.myApp.repository.DoctorRepository;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AppointmentsController {

    private final AppointmentRepository appointmentRepository;
    private final UserRepository userRepository;
    private final DoctorRepository doctorRepository;

    AppointmentsController(AppointmentRepository appointmentRepository, UserRepository userRepository, DoctorRepository doctorRepository) {
        this.appointmentRepository = appointmentRepository;
        this.userRepository = userRepository;
        this.doctorRepository = doctorRepository;
    }

    @GetMapping("/api/appointments")
    public List<Appointment> getAppointments() {
        return appointmentRepository.findAll().reversed();
    }

    @PostMapping("/api/appointments")
    public Appointment createAppointment(@RequestBody AppointmentDTO appointmentDTO) {
        User user = userRepository.findById(appointmentDTO.getUserId()).orElse(null);
        Doctor doctor = doctorRepository.findById(appointmentDTO.getDoctorId()).orElse(null);
        if (user == null || doctor == null) {
            throw new RuntimeException("User or Doctor not found");
        }
        Appointment appointment = new Appointment(user, doctor, appointmentDTO.getDateTime(), appointmentDTO.getDescription());
        return appointmentRepository.save(appointment);
    }

    @GetMapping("/api/appointments/{id}")
    public ResponseEntity<Appointment> getAppointmentById(@PathVariable Long id) {
        Appointment appointment = appointmentRepository.findById(id).orElse(null);
        if (appointment == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(appointment);
    }

    @DeleteMapping("/api/appointments/{id}")
    public ResponseEntity<Appointment> deleteAppointmentById(@PathVariable Long id) {
        Appointment appointment = appointmentRepository.findById(id).orElse(null);
        if (appointment == null) {
            return ResponseEntity.notFound().build();
        }
        appointmentRepository.delete(appointment);
        return ResponseEntity.ok().build();
    }

}