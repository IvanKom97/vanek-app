package com.example.vanekweb.entity;

import com.example.vanekweb.dto.UserDTO;
import com.example.vanekweb.enums.Roles;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;


import java.time.LocalDate;
import java.util.UUID;

@MappedSuperclass
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class AbstractUserClass {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Pattern(regexp = "\\p{L}+")
    private String first_name;
    @Pattern(regexp = "\\p{L}+")
    private String second_name;
    @Pattern(regexp = "^[\\w]+@\\p{L}{2,8}\\.\\p{L}{2,8}$", message = "email should contain: A-Z, a-z, 0-9, _")
    private String email;
    private String password;
    @Column(name = "registration_date")
    private LocalDate registrationDate;
    @Enumerated(value = EnumType.STRING)
    private Roles role;

    @Builder
    public AbstractUserClass(String first_name, String second_name, String email, String password, LocalDate registrationDate, Roles role) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
        this.role = role;
    }
}
