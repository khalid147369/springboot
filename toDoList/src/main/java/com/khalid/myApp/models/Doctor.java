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
    private String nombre;
    private String especialidad;
    private String contacto;
    private String AvatarPath;

    public Doctor() {
    }
    public Doctor( String nombre, String contacto, String especialidad , String AvatarPath) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.especialidad = especialidad;
        this.AvatarPath = AvatarPath;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }   
    public String getAvatarPath() {
        return AvatarPath;
    }
    public void setAvatarPath(String avatarPath) {
        AvatarPath = avatarPath;
    }




    

}
