package com.khalid.myApp.controlers;

import org.springframework.web.bind.annotation.RestController;

import com.khalid.myApp.DTO.UserDTO;
import com.khalid.myApp.models.User;
import com.khalid.myApp.models.Family;
import com.khalid.myApp.repository.UserRepository;
import com.khalid.myApp.repository.FamilyRepository;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UsersController {

    private final UserRepository userRepository;
    private final FamilyRepository familyRepository;

    UsersController(UserRepository userRepository, FamilyRepository familyRepository) {
        this.userRepository = userRepository;
        this.familyRepository = familyRepository;
    }

    @GetMapping("/api/users")
    public List<User> getUsers() {
        return userRepository.findAll().reversed();
    }

    @PostMapping("/api/users")
    public User createUser(@RequestBody UserDTO userDTO) {
        Family family = null;
        if (userDTO.getFamilyId() != null) {
            family = familyRepository.findById(userDTO.getFamilyId()).orElse(null);
        }
        User user = new User(userDTO.getUsername(), userDTO.getEmail(), userDTO.getPassword());
        user.setFamily(family);
        return userRepository.save(user);
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/api/users/{id}")
    public ResponseEntity<User> deleteUserById(@PathVariable Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        userRepository.delete(user);
        return ResponseEntity.ok().build();
    }
}