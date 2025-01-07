package com.example.vanekweb.exceptions;

public class EmployeeIsNotFoundException extends RuntimeException {
    public EmployeeIsNotFoundException() {
        super("employee is not found");

    }
}
