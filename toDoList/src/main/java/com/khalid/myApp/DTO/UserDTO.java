package com.khalid.myApp.DTO;

public class UserDTO {

    private String username;
    private String email;
    private String password;
    private Long familyId;

    public UserDTO() {
    }
    public UserDTO(String username, String email, String password, Long familyId) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.familyId = familyId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Long getFamilyId() {
        return familyId;
    }
    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }
}