package com.example.authsystem.controller;

import com.example.authsystem.model.AppUser;
import com.example.authsystem.service.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private final RegistrationService registrationService;


    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }


    @PostMapping("/api/v1/register")
    public ResponseEntity<RegistrationResponse> register(
            @RequestBody AppUser request
    ) {
        return ResponseEntity.ok(registrationService.register(request));
    }

    @PostMapping("/api/v1/login")
    public ResponseEntity<RegistrationResponse> login(
            @RequestBody AppUser request
    ) {
        return ResponseEntity.ok(registrationService.authenticate(request));
    }
}
