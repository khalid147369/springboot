package com.khalid.myApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="doctors")

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialty;
    private String contact;
    private String AvatarPath;
    @DecimalMin("0.0")
    @DecimalMax("5.0")
    private Double rating;

    public Doctor() {
    }
    public Doctor( String name, String contact, String specialty
 , String AvatarPath,Double rating) {
        this.name = name;
        this.contact = contact;
        this.specialty= specialty;
        this.AvatarPath = AvatarPath;
        this.rating=rating;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return name;
    }
    public void setNombre(String name) {
        this.name = name;
    }
    public String getEspecialidad() {
        return specialty
;
    }
    public void setEspecialidad(String specialty

    ) {
        this.specialty
 = specialty
;
    }
    public String getContacto() {
        return contact;
    }
    public void setContacto(String contact) {
        this.contact = contact;
    }   
    public String getAvatarPath() {
        return AvatarPath;
    }
    public void setAvatarPath(String avatarPath) {
        AvatarPath = avatarPath;
    }
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }




    

}
