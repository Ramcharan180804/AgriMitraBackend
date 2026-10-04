package org.example.dto;

public class AuthResponse {

    private String token;
    private String message;
    private Integer userId;

    public AuthResponse(String token, String message, Integer userId) {
        this.token = token;
        this.message = message;
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public String getMessage() {
        return message;
    }

    public Integer getUserId() {
        return userId;
    }
}