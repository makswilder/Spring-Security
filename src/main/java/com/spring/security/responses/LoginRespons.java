package com.spring.security.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRespons {
    private String token;
    private long expiresIn;

    public LoginRespons(String token, long expiresIn) {
        this.token = token;
        this.expiresIn = expiresIn;
    }
}
