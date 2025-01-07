package com.example.vanekweb.entity;

import com.example.vanekweb.dto.UserDTO;
import com.example.vanekweb.enums.Roles;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor

public class UserEntity extends AbstractUserClass {


    public UserEntity(UserDTO userDTO) {
        super(userDTO.getFirst_name(),
                userDTO.getSecond_name(),
                userDTO.getEmail(),
                userDTO.getPassword(),
                LocalDate.now(),
                Roles.USER);
    }
    @OneToMany(cascade = CascadeType.REMOVE,
    mappedBy = "user",
    orphanRemoval = true,
    fetch = FetchType.LAZY)
    private List<OrderEntity> orders;

}
