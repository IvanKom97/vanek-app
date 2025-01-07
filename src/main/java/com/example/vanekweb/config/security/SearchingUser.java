package com.example.vanekweb.config.security;

import com.example.vanekweb.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
@AllArgsConstructor
public class SearchingUser implements LoadingUsers{

    private UserRepository userRepository;
    @Override
    public UserDetails findByUserName(String username) {
        return new UserDetailsConfig(userRepository.findUserByEmail(username).orElseThrow());
    }

}
