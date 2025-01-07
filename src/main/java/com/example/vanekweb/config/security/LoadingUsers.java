package com.example.vanekweb.config.security;

import org.springframework.security.core.userdetails.UserDetails;

public interface LoadingUsers {
    UserDetails findByUserName(String username);
}
