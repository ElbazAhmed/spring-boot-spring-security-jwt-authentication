package com.example.authsystem.registration;

import com.example.authsystem.appuser.AppUser;
import jakarta.servlet.Registration;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
