package com.example.vanekweb.config.security;

import com.example.vanekweb.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
@AllArgsConstructor
public class SearchingEmployee implements LoadingUsers {
    private EmployeeRepository employeeRepository;
    @Override
    public UserDetails findByUserName(String username) {
        return new UserDetailsConfig(employeeRepository.findEmployeeByEmail(username).orElseThrow());
    }

}
