package com.example.authsystem.registration;

public class RegistrationResponse {
    private String token;
    private String message;

    public RegistrationResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public String getMessage() {
        return message;
    }
}
