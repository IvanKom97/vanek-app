package com.example.vanekweb.exceptions;

public class AdminIsNotFoundException extends RuntimeException {
    public AdminIsNotFoundException() {
        super("admin is not found");
    }
}
