package com.khalid.myApp.DTO;



public class DoctorDTO {

    private String name;
    private String specialty;
    private String contact;
    private String avatar;
    private Double rating;

    public DoctorDTO() {
    }
    public DoctorDTO(String name, String specialty, String contact, String avatar,Double rating ) {
        this.name = name;
        this.specialty = specialty;
        this.contact = contact;
        this.avatar = avatar;
        this.rating = rating;

    }
    public String getNombre() {
        return name;
    }
    public void setNombre(String name) {
        this.name = name;
    }
    public String getEspecialidad() {
        return specialty;
    }
    public void setEspecialidad(String specialty) {
        this.specialty = specialty;
    }
    public String getContacto() {
        return contact;
    }
    public void setContacto(String contact) {
        this.contact = contact;
    }
    public String getAvataR() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    
    

}
