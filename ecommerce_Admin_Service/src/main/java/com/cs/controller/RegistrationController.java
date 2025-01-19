package com.cs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cs.model.Admin;
import com.cs.service.AdminService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class RegistrationController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody Admin admin) {
        try {
            adminService.registerUser(admin);
            return ResponseEntity.ok("Admin registered successfully");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}