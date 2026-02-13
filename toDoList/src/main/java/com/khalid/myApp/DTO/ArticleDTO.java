package com.khalid.myApp.DTO;

public class ArticleDTO {

    private String nombre;
    private String especialidad;
    private String contacto;
    private double rating;

    public ArticleDTO() {
    }
    public ArticleDTO(String nombre, String especialidad, String contacto, double rating) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.contacto = contacto;
        this.rating = rating;
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
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
}