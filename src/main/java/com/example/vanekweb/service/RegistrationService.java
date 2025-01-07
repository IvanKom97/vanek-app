package com.example.vanekweb.service;

import com.example.vanekweb.dto.UserDTO;
import com.example.vanekweb.dto.mappers.UserMapperToEntity;
import com.example.vanekweb.entity.UserEntity;
import com.example.vanekweb.repository.EmployeeRepository;
import com.example.vanekweb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RegistrationService {
    private final EmployeeRepository employeeRepository;
    private final UserRepository userRepository;

    @Transactional()
    public ResponseEntity<String> registrationUser(UserDTO userDTO) {
        UserEntity user = UserMapperToEntity.toUserEntity(userDTO);
        userRepository.save(user);
        return ResponseEntity.ok("Registration is done successful");
    }
}
