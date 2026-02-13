package com.khalid.myApp.DTO;

import java.time.LocalDateTime;

public class AppointmentDTO {

    private Long userId;
    private Long doctorId;
    private LocalDateTime dateTime;
    private String description;

    public AppointmentDTO() {
    }

    public AppointmentDTO(Long userId, Long doctorId, LocalDateTime dateTime, String description) {
        this.userId = userId;
        this.doctorId = doctorId;
        this.dateTime = dateTime;
        this.description = description;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}