package com.example.vanekweb.exceptions;

import org.springframework.security.core.userdetails.User;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("user is not found");

    }
}
