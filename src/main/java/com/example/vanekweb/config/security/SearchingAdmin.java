package com.example.vanekweb.config.security;

import com.example.vanekweb.repository.AdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

@AllArgsConstructor
public class SearchingAdmin implements LoadingUsers {

    private AdminRepository adminRepository;

    @Override
    public UserDetails findByUserName(String username) {
        return new UserDetailsConfig(adminRepository.findAdminByEmail(username).orElseThrow());
    }
}
