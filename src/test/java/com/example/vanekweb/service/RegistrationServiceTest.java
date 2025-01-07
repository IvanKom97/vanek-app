package com.example.vanekweb.service;

import com.example.vanekweb.container.AbstractContainer;
import com.example.vanekweb.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("test")
class RegistrationServiceTest extends AbstractContainer {

    @Test
    void registrationUser() {

    }
}