package com.example.vanekweb.config.security;

import com.example.vanekweb.entity.AbstractUserClass;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserDetailsConfig implements UserDetails {
    private String email;
    private String password;
    private List<GrantedAuthority> grantedAuthorities;

    public UserDetailsConfig(AbstractUserClass user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.grantedAuthorities = List.of(new SimpleGrantedAuthority("ROLE_" + user.getRole().name()));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }
}
