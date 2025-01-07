package com.example.vanekweb.config.security;

import com.example.vanekweb.entity.AbstractUserClass;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserDetailsServiceConfig implements UserDetailsService {
    private List<LoadingUsers> all;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return all.stream()
                .map(user -> user.findByUserName(username))
                .findFirst()
                .orElseThrow();
    }
}
