package com.khalid.myApp.DTO;



public class DoctorDTO {

    private String nombre;
    private String especialidad;
    private String contacto;
    private String AvatarPath;

    public DoctorDTO() {
    }
    public DoctorDTO(String nombre, String especialidad, String contacto, String avatarPath) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.contacto = contacto;
        this.AvatarPath = avatarPath;
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
